package sweets;

/**
 * Class of Jelly Bean.
 */

public class JellyBean extends AbstractSweets {

    public JellyBean(String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @Override
    public String typeSweet() {
        return "Jelly Bean";
    }

}
