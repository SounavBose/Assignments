package language.basics;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Assignment4 {

	public static void main(String[] args) {

// Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th  cities combined.

		ArrayList<String> cities = new ArrayList<>();
		ArrayList<Integer> area = new ArrayList<>();

		// Add city names
		cities.add("Delhi");
		cities.add("Bangalore");
		cities.add("Visakhapatnam");
		cities.add("Hyderabad");
		cities.add("Lucknow");

		// Add city areas
		area.add(1484);
		area.add(741);
		area.add(681);
		area.add(650);
		area.add(631);

		// Combined area
		int combinedArea = area.get(2) + area.get(3);

		System.out.println("Combined area of 3rd and 4th city is " + combinedArea + "km²");

		/*
		 * Create a set of the top 10 most visited tourist attractions in the world and
		 * print out all of them and its size.
		 */

		// Create a HashSet to store tourist attractions
		LinkedHashSet<String> attractions = new LinkedHashSet<>();

		// Add top 10 most visited tourist attractions
		attractions.add("Great Wall of China");
		attractions.add("Eiffel Tower, France");
		attractions.add("Colosseum, Italy");
		attractions.add("Statue of Liberty, USA");
		attractions.add("Machu Picchu, Peru");
		attractions.add("Christ the Redeemer, Brazil");
		attractions.add("Taj Mahal, India");
		attractions.add("Louvre Museum, France");
		attractions.add("Times Square, USA");
		attractions.add("Grand Bazaar, Turkey");

		// Convert to array
		String[] attractionArray = attractions.toArray(new String[0]);
		// Print the attractions
		System.out.println("Top 10 Most Visited Tourist Attractions in the World:");
		System.out.println("- " + attractionArray[0]);
		System.out.println("- " + attractionArray[1]);
		System.out.println("- " + attractionArray[2]);
		System.out.println("- " + attractionArray[3]);
		System.out.println("- " + attractionArray[4]);
		System.out.println("- " + attractionArray[5]);
		System.out.println("- " + attractionArray[6]);
		System.out.println("- " + attractionArray[7]);
		System.out.println("- " + attractionArray[8]);
		System.out.println("- " + attractionArray[9]);
		// Size of the total attractions
		System.out.println("Size of the total attractions is " + attractions.size());

		/*
		 * Create an array of 10 numbers (any 10 numbers) and print out the Average of
		 * 5th and 6th Value.
		 */

		int[] num = { 2, 25, 37, 43, 56, 68, 74, 81, 90, 102 };

		// Getting the fifth and sixth value
		int fifthVal = num[4];
		int sixthVal = num[5];

		// Average of the numbers
		int average = (fifthVal + sixthVal) / 2;

		// Print the average value
		System.out.println("The average of the 2 values is " + average);

		/*
		 * Create a list of the top 5 highest-grossing movies of all time and print out
		 * the third movie on the list.
		 */
		ArrayList<String> movies = new ArrayList<>();

		// Adding the movies in the list
		movies.add("Avatar");
		movies.add("Avengers: Endgame");
		movies.add("Titanic");
		movies.add("Star Wars: The Force Awakens");
		movies.add("Avengers: Infinity War");
		
		//Printing the third movie
		System.out.println("The third highest grossing movie in the list is "+ movies.get(2));

	}

}
