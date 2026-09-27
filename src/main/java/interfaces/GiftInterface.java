package interfaces;

import sweets.AbstractSweets;

import java.util.List;

/**
 * Interface for gift.
 */

public interface GiftInterface {

    void addSweets(List<? extends AbstractSweets> sweets);

    void addSweet(AbstractSweets sweet);

    /** Общий вес подарка */
    double getTotalWeight();

    /** Список всех сладостей в подарке */
    List<AbstractSweets> getSweets();

    /** Сортировка по калорийности (по возрастанию) */
    List<AbstractSweets> sortByCalories();

    /** Найти сладости с калорийностью в диапазоне [min, max] */
    List<AbstractSweets> findByCaloriesRange(int min, int max);

    /** Найти сладости с весом в диапазоне [min, max] */
    List<AbstractSweets> findByWeightRange(double min, double max);
}