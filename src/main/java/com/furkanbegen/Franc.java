package com.furkanbegen;

/**
 * @author furkanbegen
 * createn at 23/01/2019
 * on project tdd-by-example
 */
public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier){
        return Money.franc(amount * multiplier);
    }
}
