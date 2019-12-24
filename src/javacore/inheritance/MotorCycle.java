package javacore.inheritance;

public class MotorCycle extends Cycle {

	@Override
	String defineMe() {
		return "a cycle with an engine.";
	}
	
	void greet() {
		System.out.println("Hi, i am a MotorCycle. I am " + defineMe());
		System.out.println("My ancestor is a cycle, who is " + super.defineMe());
	}
	
	
}
