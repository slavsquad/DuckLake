package com.company;

import com.company.Ducks.Duck;
import com.company.Ducks.MallardDuck;
import com.company.Ducks.ModelDuck;
import com.company.FlyBehaviors.FlyRockedPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();
        model.performQuack();

    }
}
