package utils;

import java.util.Comparator;
import sweets.AbstractSweets;

/**
 * Class for sorting candies.
 */

public class SortByCalories implements Comparator<AbstractSweets> {

    @Override
    public int compare(AbstractSweets candy1, AbstractSweets candy2) {
        if (candy1.getCalories() > candy2.getCalories()) {
            return -1;
        } else if (candy1.getCalories() < candy2.getCalories()) {
            return 1;
        } else {
            return 0;
        }
    }
}
