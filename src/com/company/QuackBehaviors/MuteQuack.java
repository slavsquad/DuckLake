package com.company.QuackBehaviors;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("No Quack!");
    }
}
