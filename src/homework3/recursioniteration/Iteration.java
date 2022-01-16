package homework3.recursioniteration;

public class Iteration {

	public static void main(String[] args) {
		System.out.println("The factorial is: " + factorial(5));
		
	}
		
	
	public  static int factorial(int x) {
		
		int a = 1;
		for(int b = x; b>1; b--) {
			a = a * b;
			
		}
		return a;
		
			
		}
	}
		
	


