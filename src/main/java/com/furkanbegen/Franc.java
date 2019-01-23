package com.furkanbegen;

/**
 * @author furkanbegen
 * createn at 23/01/2019
 * on project tdd-by-example
 */
public class Franc {

    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc  times(int multiplayer){
        return new Franc(amount * multiplayer);
    }

    public boolean equals(Object object){
        Franc franc = (Franc) object;

        return amount == franc.amount;
    }
}
