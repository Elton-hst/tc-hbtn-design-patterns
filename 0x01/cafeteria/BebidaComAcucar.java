
import cafeteria.Bebida;

import java.util.List;

public class BebidaComAcucar extends BebidaDecorator {

    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }
    @Override
    public List<String> obterIngredientes() {
        List<String> list = super.obterIngredientes();
        list.add("acucar");
        return list;

    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;

    }
}