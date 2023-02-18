package com.design.decorator;

/*
 * Notes:
 * interchangeable with a Beverage, so we extend the Beverage class
 * 
 * Author: DGupta
 * */
public abstract class CondimentDecorator extends Beverage {
	// Here the Beverage that each Decorator will be wrapping.
	// Notice we are using the Beverage supertype to refer to the Beverage so the Decorator can wrap any beverage
	public Beverage beverage;
	
	// We're also going to require that the condiment decorators all re-implement the getDescription method.
	public abstract String getDescription();

}
