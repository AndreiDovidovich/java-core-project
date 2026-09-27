package sweets;

/**
 * Class wafer.
 */

public class Waffle extends AbstractSweets {

    public Waffle(String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @Override
    public String typeSweet() {
        return "Waffle";
    }

}
