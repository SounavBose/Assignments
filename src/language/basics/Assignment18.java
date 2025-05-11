package language.basics;

public class Assignment18 {
	
	
	public static boolean isPalindrome(String s) {
        if (s == null) return false;

        // Convert string to lowercase and remove non-alphanumeric characters
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned string is the same when reversed
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

	public static void main(String[] args) {
		 String input = "A man, a plan, a canal: Panama";
	        System.out.println(isPalindrome(input)); // Output: true

	        input = "race a car";
	        System.out.println(isPalindrome(input)); // Output: false
	    

	}

}
