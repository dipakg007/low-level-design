package com.design.strategy;

public class MallardDuck extends Duck {

	public MallardDuck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
		this.flyBehaviour = flyBehaviour;
		this.quackBehaviour = quackBehaviour;
	}

	@Override
	public void display() {
		System.out.println("MallardDuck");
	}

}
