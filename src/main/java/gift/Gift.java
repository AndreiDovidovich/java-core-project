package gift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import sweets.AbstractSweets;
import utils.SortByCalories;
import sweets.Candy;
import interfaces.GiftInterface;

/**
 * Gift class, which includes sweets of class AbstractSweets.
 */

public class Gift implements GiftInterface {
    private final List<AbstractSweets> sweets;

    public Gift() {
        sweets = new ArrayList<>();
    }

    @Override
    public void addSweet(AbstractSweets sweet) {
        if (sweet == null) {
            throw new IllegalArgumentException("Sweet must not be null");
        }
        sweets.add(sweet);
    }

    @Override
    public void addSweets(List<? extends AbstractSweets> newSweets) {
        if (newSweets == null) {
            throw new IllegalArgumentException("Sweets list must not be null");
        }
        sweets.addAll(newSweets);
    }

    @Override
    public double getTotalWeight() {
        return sweets.stream().mapToDouble(AbstractSweets::getWeight).sum();
    }

    /**
     * Sorts candy in gift for calories.
     * @return sorted list
     */
    @Override
    public List<AbstractSweets> sortByCalories() {
        var resultList = new ArrayList<AbstractSweets>();
        for (AbstractSweets sweet : sweets) {
            if (sweet instanceof Candy) {
                resultList.add(sweet);
            }
        }
        Collections.sort(resultList, new SortByCalories());
        return resultList;
    }

    @Override
    public List<AbstractSweets> findByCaloriesRange(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "min (" + min + ") must be <= max (" + max + ")");
        }
        return sweets.stream()
                .filter(s -> s.getCalories() >= min && s.getCalories() <= max)
                .collect(Collectors.toList());
    }

    @Override
    public List<AbstractSweets> findByWeightRange(double min, double max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "min (" + min + ") must be <= max (" + max + ")");
        }
        return sweets.stream()
                .filter(s -> s.getWeight() >= min && s.getWeight() <= max)
                .collect(Collectors.toList());
    }

    @Override
    public List<AbstractSweets> getSweets() {
        return sweets;
    }
}
