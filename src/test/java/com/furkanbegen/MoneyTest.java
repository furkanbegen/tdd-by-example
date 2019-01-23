package com.furkanbegen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author furkanbegen
 * createn at 19/01/2019
 * on project tdd-by-example
 */
public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar prodcut = five.times(2);
        assertEquals(10, prodcut.amount);
        prodcut = five.times(3);
        assertEquals(15, prodcut.amount);
    }
}