package com.furkanbegen;

/**
 * @author furkanbegen
 * createn at 23/01/2019
 * on project tdd-by-example
 */
public class Money {

    protected int amount;

    public boolean equals(Object object){
        Money money = (Money) object;

        return amount == money.amount && this.getClass().equals(object.getClass());
    }
}
