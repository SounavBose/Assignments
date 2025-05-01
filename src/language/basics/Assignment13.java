package language.basics;

public class Assignment13 {
	
	public static boolean isPrime(int n) {
		
		if (n<=1) {
			return false; //1 and below are not prime
		}
		
		for (int i = 2; i< n; i++) {
			if (n%i==0) {
				return false; //found a divisor other than 1 and itself
			}
		}
		
		return true; // No divisors found so it is Prime
	}

	public static void main(String[] args) {
		
		Assignment13 obj = new Assignment13();
		System.out.println("Input = 7 " + "Prime Number: " + obj.isPrime(7));
		System.out.println("Input = 25 " + "Prime Number: " + obj.isPrime(25));
		System.out.println("Input = 1 " + "Prime Number: " + obj.isPrime(1));
	
	}

}
