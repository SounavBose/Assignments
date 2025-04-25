package language.basics;

public class Assignment10 {

	public static void main(String[] args) {

		// Initialize the array
		int[] arr = { 12, 34, 11, 36, 87, 98, 93 };

		int first = arr[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		// Find first largest

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > first) {
				first = arr[i];
			}
		}

		// Find second largest
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > second && arr[i] < first) {
				second = arr[i];
			}
		}

		// Find third largest
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > third && arr[i] < second) {
				third = arr[i];
			}
		}

		System.out.println("Second Largest numbers is: " + second);
		System.out.println("Third Largest numbers is: " + third);

	}

}
