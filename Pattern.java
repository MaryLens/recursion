package main;

public class Pattern {

	public static void main(String[] args) {

		pattern(5);

	}

	static String str = "";

	public static void pattern(int n) {
		if (n < 0) {
			System.out.println("you can not enter a negative number");
		} else if (n == 0) {
			str = "";
		} else {
			str = str + "*";
			System.out.println(str);
			pattern(n - 1);
		}
	}

}
