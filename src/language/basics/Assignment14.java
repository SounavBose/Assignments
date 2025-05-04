package language.basics;

public class Assignment14 {

	public static void main(String[] args) {
		int max = 5; // This defines the largest number on the widest row

        // Upper part of the diamond (increasing)
        for (int i = 1; i <= max; i++) {
            // Print leading spaces
            for (int j = i; j < max; j++) {
                System.out.print(" ");
            }
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Lower part of the diamond (decreasing)
        for (int i = max - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = max; j > i; j--) {
                System.out.print(" ");
            }
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
	}

}
}