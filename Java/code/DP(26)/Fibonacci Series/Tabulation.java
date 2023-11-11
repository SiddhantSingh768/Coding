import java.util.Arrays;

public class Tabulation {

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			int[] table = new int[n + 1];
			table[0] = 0;
			table[1] = 1;
			for (int i = 2; i <= n; i++) {
				table[i] = table[i - 1] + table[i - 2];
			}
			return table[n];
		}
	}

	public static void main(String[] args) {
		int n = 6; // Find the 6th Fibonacci number
		int result = fibonacci(n);
		System.out.println("The " + n + "th Fibonacci number is: " + result);
	}
}
