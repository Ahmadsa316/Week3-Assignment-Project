package org.example.week3_assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartCalculatorTest {

    @Test
    void testCalculateItemCost() {
        double result = CartRecoed.calculateItemCost(10.0, 3);
        assertEquals(30.0, result);
    }

    @Test
    void testAddToTotal() {
        double result = CartRecoed.addToTotal(50.0, 25.0);
        assertEquals(75.0, result);
    }
}