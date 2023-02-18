package com.design.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast(){
		description = "Dark Roast";
	}
	
	@Override
	public int getCost() {
		return 4;
	}

}
