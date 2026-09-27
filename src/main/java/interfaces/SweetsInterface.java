package interfaces;

/**
 * INterface for sweets.
 */

public interface SweetsInterface {
    int MAX_WEIGHT_SWEET = 150;
    int MAX_CALORIES_SWEET = 600;
    double MAX_COST_CANDY = 30.0;

    String typeSweet();

    double getWeight();

    String getName();

    void setCount(int count);

    int getCount();

    int getCalories();
}