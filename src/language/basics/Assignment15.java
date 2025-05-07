package language.basics;

public class Assignment15 {

	public static void main(String[] args) {
		
		String sentence = "Java programming is fun and challenging";

        // Part 1: Count the total number of words
        String[] words = sentence.split(" ");
        int wordCount = words.length;
        System.out.println("Total number of words: " + wordCount);

        // Part 2: Print the sentence words in reverse order
        System.out.print("Words in reverse order: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) 
            	System.out.print(" ");
        }
        System.out.println();

        // Part 3: Convert first character of each word to uppercase
        
        String titleCasedSentence = "";

        for (String word : words) {
            // Capitalize first letter and concatenate with the rest
            titleCasedSentence += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }

        // Remove the trailing space
        titleCasedSentence = titleCasedSentence.trim();
        System.out.println("Title-cased sentence: " + titleCasedSentence);
    }

	}


