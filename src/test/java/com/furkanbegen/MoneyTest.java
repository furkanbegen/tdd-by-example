package com.furkanbegen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author furkanbegen
 * createn at 19/01/2019
 * on project tdd-by-example
 */
public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Dollar five = new Dollar(5);
        Dollar prodcut = five.times(2);
        assertEquals(new Dollar(10), prodcut);
        prodcut = five.times(3);
        assertEquals(new Dollar(15), prodcut);
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
    }

    @Test
    void testMultiplicationFrank() {
        Franc five = new Franc(5);
        Franc prodcut = five.times(2);
        assertEquals(new Franc(10), prodcut);
        prodcut = five.times(3);
        assertEquals(new Franc(15), prodcut);
    }

     @Test
    void testEqualityFrank() {
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(8));
    }
}