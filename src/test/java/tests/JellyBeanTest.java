package tests;

import org.junit.jupiter.api.Test;
import sweets.JellyBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JellyBeanTest {
    
    /**
     * Test of typeSweet method, of class JellyBean.
     */
    @Test
    public void testTypeSweet() {
        JellyBean instance = new JellyBean("Желатинки",4,5);
        assertEquals("Желатинки", instance.typeSweet());
    }

    /**
     * Test of getWeight method, of class JellyBean.
     */
    @Test
    public void testGetWeight() {
        JellyBean instance = new JellyBean("Желатинки",4,5);
        assertEquals(4, instance.getWeight());
    }
}
