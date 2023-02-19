package com.design.demo;

import com.design.strategy.Duck;
import com.design.strategy.FlyWithWings;
import com.design.strategy.MallardDuck;
import com.design.strategy.Quack;

public class StrategyMainDemo {
	public static void main(String args[]) {
		Duck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
	}
}
