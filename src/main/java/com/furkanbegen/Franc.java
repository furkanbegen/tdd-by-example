package com.furkanbegen;

/**
 * @author furkanbegen
 * createn at 23/01/2019
 * on project tdd-by-example
 */
public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier){
        return new Franc(amount * multiplier);
    }
}
