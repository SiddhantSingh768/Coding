import java.util.*;
//Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N.
public class NbinaryNumbers{

	static void generatePrintBinary(int n) {
		for (int i = 1; i <= n; i++) {
			String str = "";
			int temp = i;
			while (temp != 0) {
				if ((temp & 1) == 1) {
					str = "1" + str;
				} else {
					str = "0" + str;
				}
				temp = temp >> 1;
			}
			System.out.println(str);
		}
	}

	// Driver code
	public static void main(String[] args) {
		int n = 10;

		// Function call
		generatePrintBinary(n);
	}
}
