package com.furkanbegen;

/**
 * @author furkanbegen
 * createn at 23/01/2019
 * on project tdd-by-example
 */
public abstract class Money {

    protected int amount;

    public abstract Money times(int multiplier);

    public static Money dollar(int amount){
        return new Dollar(amount);
    }

    public static Money franc(int amount){
        return new Franc(amount);
    }

    public boolean equals(Object object){
        Money money = (Money) object;

        return amount == money.amount && this.getClass().equals(object.getClass());
    }
}
