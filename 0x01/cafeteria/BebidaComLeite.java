
import cafeteria.Bebida;

import java.util.List;

public class BebidaComLeite extends BebidaDecorator {

    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> list = super.obterIngredientes();
        list.add("leite");
        return list;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 3.2;
    }
}