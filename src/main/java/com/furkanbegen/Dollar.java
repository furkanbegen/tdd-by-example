package com.furkanbegen;

/**
 * @author furkanbegen
 * createn at 19/01/2019
 * on project tdd-by-example
 */
public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar  times(int multiplayer){
        return new Dollar(amount * multiplayer);
    }
}
