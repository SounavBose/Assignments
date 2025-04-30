package language.basics;

public class Assignment12 {
	public double power(double x, int n) {
		// Handle negative exponent
		if (n < 0) {
			x = 1 / x;
			n = -n;
		}

		double result = 1.0;
		for (int i = 0; i < n; i++) {
			result *= x;
		}

		return result;
	}

	public static void main(String[] args) {
		Assignment12 obj = new Assignment12();
		System.out.println(obj.power(2.00000, 10));
		System.out.println(obj.power(2.10000, 3));
		System.out.println(obj.power(2.00000, -2));
	}
}
