package com.design.decorator;

/*
 * Notes:
 * We extends the Beverage class since this is a beverage
 * 
 * Author: DGupta
 * */
public class Espresso extends Beverage {

	// To take care of the description, we set the description in constructor
	// description instance variable is inherited from Beverage class.
	public Espresso() {
		description = "Espresso";
	}
	
	//Base Condition.
	// We don't need worry about adding in condiments in this class, we just need to return the price of Espresso
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 2;
	}

}
