package com.syntax.class24;

public class BirdTest {
	public static void main(String[] args) {

		Bird bird = new BabyBird();//upcasting --> referring object of subclass is referred by a Superclass
		//achiving runtime polymorphism
		bird.fly();
		bird.eat();
		bird.sleep();
		//bird.cry(); not available
		//during compilation compiler gives access based on reference type
		BabyBird bb = new BabyBird();
		bb.fly();
		bb.sleep();
		bb.eat();
		bb.cry();
	}
	
}
