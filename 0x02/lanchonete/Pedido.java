import java.util.HashSet;

import java.util.HashSet;

public class Pedido {

    private TipoLanche tipoLanche;
    private TamanhoBatata tamanhoBatata;
    private TipoBrinde tipoBrinde;
    private TipoBebida tipoBebida;
    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public Pedido(TipoBebida tipoBebida, TipoBrinde tipoBrinde, TamanhoBatata tamanhoBatata, TipoLanche tipoLanche) {

        this.tipoBebida = tipoBebida;
        this.tipoBrinde = tipoBrinde;
        this.tamanhoBatata = tamanhoBatata;
        this.tipoLanche = tipoLanche;
        if (tipoBebida != null){
            itensForaCaixa.add(new ItemPedido(TipoItemPedido.BEBIDA, tipoBebida.name()));
        }
        if(tipoBrinde != null) {
            itensDentroCaixa.add(new ItemPedido(TipoItemPedido.BRINDE, tipoBrinde.name()));
        }
        if(tamanhoBatata != null) {
            itensDentroCaixa.add(new ItemPedido(TipoItemPedido.BATATA, tamanhoBatata.name()));
        }
        if(tipoLanche != null) {
            itensDentroCaixa.add(new ItemPedido(TipoItemPedido.LANCHE, tipoLanche.name()));
        }
    }

    public HashSet<ItemPedido> getItensDentroCaixa() {
        return itensDentroCaixa;
    }

    public void setItensDentroCaixa(HashSet<ItemPedido> itensDentroCaixa) {
        this.itensDentroCaixa = itensDentroCaixa;
    }

    public HashSet<ItemPedido> getItensForaCaixa() {
        return itensForaCaixa;
    }

    public void setItensForaCaixa(HashSet<ItemPedido> itensForaCaixa) {
        this.itensForaCaixa = itensForaCaixa;
    }

    public void adicionarItemDentroCaixa(ItemPedido item){
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item){
        itensForaCaixa.add(item);

    }

    @Override
    public String toString() {

        String result1 = "";

        result1 += "\tFora da Caixa:\n";

        for (ItemPedido item : itensForaCaixa){
            result1 += String.format("\t\t- %s %s\n", item.getTipo(), item.getNome());
        }

        String result2 = "";

        result2 += "\tDentro da Caixa:\n";

        for (ItemPedido item : itensDentroCaixa){
            result2 += String.format("\t\t- %s %s\n", item.getTipo(), item.getNome());
        }

        return result1 + result2;
    }
}
