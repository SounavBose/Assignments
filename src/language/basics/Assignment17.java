package language.basics;

public class Assignment17 {

	public static void main(String[] args) {
		int rows = 5; // We can change this value or take user input

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
	}

}
