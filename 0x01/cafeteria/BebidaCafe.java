import java.util.ArrayList;
import java.util.List;

public class BebidaCafe extends Bebida{

    @Override
    public List<String> obterIngredientes() {
        List<String> cafe = new ArrayList<>();
        cafe.add("cafe");
        return cafe;

    }

    @Override
    public double obterPreco() {

        return 5.35;
    }
}