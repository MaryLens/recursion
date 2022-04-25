package main;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(8));

	}

	static int ind = 1;
	public static Integer factorial(int n) {
		if (n < 0) {
			System.out.println("you can not enter a negative number");
			return null;
		}
		Integer result = 1;
		if (n == 0) {
			if (ind ==1) System.out.print(n+"! = ");
			return result;
		}
		if (ind ==1) System.out.print(n+"! = ");
		ind++;
		result = n * factorial(n - 1);
		return result;
	}
}
