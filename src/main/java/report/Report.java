package report;

import java.util.ArrayList;
import java.util.List;
import gift.Gift;
import interfaces.SweetsInterface;
import sweets.AbstractSweets;
import sweets.Candy;

/**
 * Class for reporting about gift.
 */

public class Report {

    private List<AbstractSweets> enterSweets;
    private final Gift gift1;
    private final String PREVIEW_GIFT = "Basic information about your gift: \n";
    private final String WEIGHT_GIFT = "Weight: ";
    private final String FIND_CANDY = "Candies from a given price range: \n";
    private final String ALL_SWEETS = "All the sweets in the gift: \n";

    public Report(Gift g1) {
        this.gift1 = g1;
        enterSweets = new ArrayList<>();
    }
    
    public void outputResult() {
        System.out.print(PREVIEW_GIFT + WEIGHT_GIFT + gift1.getTotalWeight() + " gram " + "\n");
        getAllSweets();
    }

    public void makeFindCandy(int min, int max) {
        System.out.print(FIND_CANDY);
        System.out.print("From " + min + " to " + max + " calories -----  \n");
        enterSweets = gift1.findByCaloriesRange(min, max);
        if (enterSweets.isEmpty()) {
            System.out.println("No these candies \n");
        } else {
            for (AbstractSweets sweet : enterSweets) {
                System.out.println(sweet.getName() + "  ( " + sweet.getCalories() + " calories )" + "\n");
            }
        }
    }

    public void makeSortCandy() {
        System.out.print("Sorting of candies by calories: \n");
        enterSweets = gift1.sortByCalories();
        if (enterSweets.isEmpty()) {
            System.out.println("No candies \n");
        } else {
            for (AbstractSweets sweet : enterSweets) {
                System.out.println("Name:  " + sweet.getName() + "  Calories: " + sweet.getCalories() + "\n");
            }
        }
    }

    private void getAllSweets() {
        System.out.print(ALL_SWEETS);
        enterSweets = gift1.getSweets();
        for (SweetsInterface s : enterSweets) {
            System.out.println("Name:  " + s.getName() + "  Type: " + s.typeSweet()
                    + "  Calories: " + s.getCalories() + "  " + WEIGHT_GIFT + " " + s.getWeight() + "\n");
        }
    }
}
