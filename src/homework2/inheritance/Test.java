package homework2.inheritance;

public class Test {

	public static void main(String[] args) {
		
		//Monkey to Infant:is a single inheritance
		//Animals to Monkey to Infant: is a multi level inheritance
		//Monkey class is super class to Infant class
		//Animals class is a super class to Monkey class 
		// Mouse class to Animals class and Mouse class to Rodents class:is hierarchical inheritance
		
		Monkey bingo = new Monkey();
		
		bingo.eat();
		bingo.drink();
		
		Infant aldo = new Infant();
		
		aldo.eat();
		aldo.drink();
		bingo.sleeping();
		aldo.sleeping();
		
		Animals smart = new Animals();
		
		smart.jump();
		smart.run();
		
		Mouse pest = new Mouse();
		
		pest.jump();
		pest.run();
		
		

	}

}
