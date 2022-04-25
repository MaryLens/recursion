package main;

public class Calculation {

	public static void main(String[] args) {
		
		try {
		    System.out.println(calculate(2, 2));
		} catch (ArithmeticException e) {
		    System.out.println(e.getMessage());
		}

	}
	
	private static double calculate(int x, int n) throws ArithmeticException {
	    if (x == 0 && n == 0) {
	        throw new ArithmeticException("Невалидные входные данные: Неопределенность типа 0^0");
	    }

	    if (n < 0) {
	        throw new ArithmeticException("Невалидные входные данные: Факториал из отрицательного числа!");
	    }

	    if (n == 0) {
	        return 1;
	    }

	    if (x == 0) {
	        return 0;
	    }

	    return power(x, n) / n;
	}

	private static double power(int x, int n) {
	    if (n == 1) return x;
	    return x * calculate(x, n - 1);
	}

}
