package homework3.recursionfactorial;

public class Factorail {

	public static void main(String[] args) {
		System.out.println("The factorial is: " + factorial(5));
		
	}
	
	public static int factorial(int x) {
		if (x<=1) {
			return 1;
			}
		else 
			return x * factorial(x-1);
	}
}
		
		