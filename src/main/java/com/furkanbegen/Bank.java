package com.furkanbegen;

/**
 * @author furkanbegen
 * createn at 07/07/2019
 * on project tdd-by-example
 */
public class Bank {

    Money reduce(Expression source, String toCurrency){
        return source.reduce(toCurrency);
    }
}
