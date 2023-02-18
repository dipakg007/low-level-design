package com.design.demo;

import com.design.decorator.Beverage;
import com.design.decorator.DarkRoast;
import com.design.decorator.Espresso;
import com.design.decorator.Mocha;
import com.design.decorator.Whip;

/*
 * Notes:
 * Important class to take the notes Espresso.java, Mocha.java, CondimentDecorator.java and Beverage.java
 * 
 * Author: DGupta
 * */
public class DecoratorMainDemo {
	public static void main(String args[]) {
		// Order espresso, no condiments and print its description and cost.
		Beverage beverage1 = new Espresso();
		System.out.println(beverage1.getDescription() + " Rs. " + beverage1.getCost());
		
		// order DarkRoast object
		Beverage beverage2 = new DarkRoast();
		// wrap it with a mocha
		beverage2 = new Mocha(beverage2);
		// wrap it with second mocha
		beverage2 = new Mocha(beverage2);
		// wrap it with a whip
		beverage2 = new Whip(beverage2);

		System.out.println(beverage2.getDescription() + " Rs. " + beverage2.getCost());
	}
}
