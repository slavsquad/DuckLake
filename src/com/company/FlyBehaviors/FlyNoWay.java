package com.company.FlyBehaviors;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No fly!");
    }
}
