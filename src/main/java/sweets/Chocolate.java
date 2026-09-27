package sweets;

/**
 * Class chocolates.
 */

public class Chocolate extends AbstractSweets {

    public Chocolate(String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @Override
    public String typeSweet() {
        return "Chocolate";
    }

}
