package language.basics;

public class Assignment16 {

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web "
				+ "development, mobile applications, and more.";

		// part 1: Divide into words
		String[] words = paragraph.split("\\s+"); // split by whitespace

		// part 2 & 3: Find occurrences and print indexes
		int count = 0;
		System.out.print("Indexes of 'Java': ");
		for (int i = 0; i < words.length; i++) {
			// Remove punctuation from end of word (e.g., "Java.")
			String cleanedWord = words[i].replaceAll("[^a-zA-Z]", "");

			if (cleanedWord.equals("Java")) {
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.println("\nTotal number of occurrences of 'Java': " + count);
	}

}
