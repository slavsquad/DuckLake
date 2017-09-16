package com.company.Ducks;

import com.company.FlyBehaviors.FlyNoWay;
import com.company.QuackBehaviors.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm model decoy duck!");
    }
}
