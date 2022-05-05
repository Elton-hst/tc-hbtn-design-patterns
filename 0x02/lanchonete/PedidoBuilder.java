public class PedidoBuilder extends PedidoAbstractBuilder{

    private TipoBebida tipoBebida;

    private TipoBrinde tipoBrinde;
    private TamanhoBatata tamanhoBatata;
    private TipoLanche tipoLanche;


    private Pedido pedido;

    public PedidoBuilder() {
    }

    public PedidoBuilder(Pedido pedido) {
        this.pedido = pedido;
    }


    @Override
    void setBebida(TipoBebida tipo) {
        this.tipoBebida = tipo;
    }

    @Override
    void setBrinde(TipoBrinde tipo) {
        this.tipoBrinde = tipo;
    }

    @Override
    void setBatata(TamanhoBatata tamanho) {
        this.tamanhoBatata = tamanho;
    }

    @Override
    void setLanche(TipoLanche tipo) {
        this.tipoLanche = tipo;
    }

    public Pedido build() {
        return new Pedido(tipoBebida,  tipoBrinde, tamanhoBatata,tipoLanche);
    }
}