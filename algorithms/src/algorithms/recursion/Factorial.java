package algorithms.recursion;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(factorialOf(201));
	}
	
	// n! = n * (n-1)!
	public static double factorialOf(double number)
	{
		if (number <= 0)
		{
			return 1;
		}
		return number*factorialOf(number-1);
	}
}
