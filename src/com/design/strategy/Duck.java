package com.design.strategy;

public abstract class Duck {
	IFlyBehaviour flyBehaviour;
	IQuackBehaviour quackBehaviour;

	public Duck() {
	}

	public abstract void display();

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}
}
