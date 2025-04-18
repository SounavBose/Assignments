package language.basics;

public class Assignment7 {

	public static void main(String[] args) {
		// Customer details
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;

		boolean isEligible = false; // Default to not eligible

		// Loan evaluation logic
		if (creditScore > 750) {
			isEligible = true; // Automatically approved
		} else if (creditScore >= 650) {
			if (income >= 50000) {
				if (isEmployed) {
					if (debtToIncomeRatio < 40) {
						isEligible = true;
					}
				}
			}
		}

		// Output result
		if (isEligible) {
			System.out.println(customerName + " is eligible for the loan.");
		} else {
			System.out.println(customerName + " is not eligible for the loan.");
		}
	}

}
