package com.design.strategy;

public class MuteQuack implements IQuackBehaviour {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}
