package sweets;

import exceptions.InvalidSweetParameterException;

/**
 * Class candies.
 */

public class Candy extends AbstractSweets {

    private final CandiesEnum typeCandy;
    private final double cost;

    public Candy(CandiesEnum typeCandy, String name, int weight, int calories, double cost) {
        super(name, weight, calories);
        validateCost(cost);

        this.cost = cost;
        this.typeCandy = typeCandy;
    }

    public double getCost() {
        return calcCost();
    }
    
    /**
     * Calculate the cost of certain kind candies.
     */
    private double calcCost() {
        //find the price of 1 gram and multiply by the total numer og grams of certain candies in the gift
        double sum = getWeight()*getCount() * (cost / 1000);
        return sum;
    }

    private static void validateCost(double cost) {
        try {
            if ((cost <= 2.0) || (cost > MAX_COST_CANDY)) {
                throw new InvalidSweetParameterException("Sweet name must not be blank");
            }
        } catch (InvalidSweetParameterException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String typeSweet() {
        String resultType = "Candy";
        switch (typeCandy) {
            case BIRDMILK:
                resultType = "Candy Bird`s Milk";
                break;
            case LOLIPOP:
                resultType = "Lolipop candy";
                break;
            case PEANUT:
                resultType = "Peanut candy";
                break;
        }
        return resultType;
    }
}