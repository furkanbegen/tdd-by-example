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

    public void times(int multiplayer){
        amount *= multiplayer;
    }
}
