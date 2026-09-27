package tests;

import org.junit.jupiter.api.Test;
import sweets.CandiesEnum;
import sweets.Candy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyTest {

    /**
     * Test of getCost method, of class Candy.
     */
    @Test
    public void testGetCost() {
        Candy instance = new Candy(CandiesEnum.LOLIPOP, "Золотой ключик", 15, 557, 4);
        assertEquals(4.0, instance.getCost(), 4.0);
    }

    /**
     * Test of typeSweet method, of class Candy.
     */
    @Test
    public void testTypeSweet() {
        Candy instance = new Candy(CandiesEnum.LOLIPOP, "Золотой ключик", 15, 557, 4);
        assertEquals("Конфета сосулька", instance.typeSweet());
    }
}
