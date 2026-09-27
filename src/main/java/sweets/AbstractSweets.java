package sweets;

import java.util.Random;

import exceptions.InvalidSweetParameterException;
import interfaces.SweetsInterface;

/**
 * Abstract basic class for all the sweets.
 */

public abstract class AbstractSweets implements SweetsInterface {

    private final String name;
    private final double weight;
    private final int calories;
    private int count;

    public AbstractSweets(String name, double weight, int calories) {
        validateName(name);
        validateWeight(weight);
        validateCalories(calories);

        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.count = count;
    }

    private static void validateName(String name) {
        try {
            if (name == null || name.isBlank()) {
                throw new InvalidSweetParameterException("Sweet name must not be blank");
            }
        } catch (InvalidSweetParameterException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateWeight(double weight) {
        try {
            if (weight <= 0) {
                throw new InvalidSweetParameterException("Sweet weight must be positive, but was: " + weight);
            }
        } catch (InvalidSweetParameterException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateCalories(int calories) {
        try {
            if (calories < 0) {
                throw new InvalidSweetParameterException("Sweet calories must be non-negative, but was: " + calories);
            }
        } catch (InvalidSweetParameterException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Name of candy = ").append(name).append("  weight = ").append(weight).append("  calories = ").append(calories);
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AbstractSweets other = (AbstractSweets) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        Random random = new Random();
        final int prime = random.nextInt(100);
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}
