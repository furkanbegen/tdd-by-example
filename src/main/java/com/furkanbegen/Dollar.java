package com.furkanbegen;

/**
 * @author furkanbegen
 * createn at 19/01/2019
 * on project tdd-by-example
 */
public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier){
        return Money.dollar(amount * multiplier);
    }
}
