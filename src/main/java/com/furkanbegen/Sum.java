package com.furkanbegen;

/**
 * @author furkanbegen
 * createn at 07/07/2019
 * on project tdd-by-example
 */
public class Sum implements Expression{
    Money augend;
    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String to){
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
