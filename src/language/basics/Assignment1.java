package language.basics;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Assignment1 {

	public static void main(String[] args) {

		// Temperature of a city in degrees Celsius: 25.5

		float temp = 25.5f;
		System.out.println("The temparature of a city is: " + temp);

		// Whether a customer has placed an order

		boolean order = true;
		System.out.println("The order places is: " + order);

		// Person's phone number: "123-456-7890"

		String phoneNumber = "123-456-7890";
		System.out.println("Person's phonenumber is: " + phoneNumber);

		// Amount of money in a customer's bank account: 1000.50

		float money = 1000.50f;
		System.out.println("The amount of money in customer's bank account is: " + money);

		// Person's email address: "john.doe@example.com"

		String email = "john.doe@example.com";
		System.out.println("Email address of the person is: " + email);

		// Coordinates of a location (latitude, longitude): 37.7749, -122.4194

		double latitude = 37.7749;
		double longitude = -122.4194;
		System.out.println("Coordinates of the location is: " + latitude + "," + longitude);

		// Person's marital status: true or false

		boolean maritalStatus = false;
		System.out.println("Marital status is: " + maritalStatus);

		// Person's occupation: "Software Engineer"

		String occupation = "Software Engineer";
		System.out.println("Occupation is: " + occupation);

		// Person's favourite colour: "Blue"

		String colour = "Blue";
		System.out.println("Favourite colour is: " + colour);

		// Current year: 2023

		int year = 2023;
		System.out.println("Current Year is: " + year);

		// Number of followers on a social media platform: 1,000,000

		String followers = "1,000,000";
		System.out.println("THe total number of followers are: " + followers);

		// Rating of a movie: 7.5
		float rating = 7.5f;
		System.out.println("Rating of a movie is: " + rating);

		// Person's blood type: 'A'

		char bloodType = 'A';
		System.out.println("Blood Type is: " + bloodType);

		// Title of a book: "To Kill a Mockingbird"

		String title = "To Kill a Mockingbird";
		System.out.println("Title of the book is: " + title);

		// Number of employees in a company: 500
		int employees = 500;
		System.out.println("Number of employees are: " + employees);

		// Time of an event: 2:30 PM
		LocalTime eventTime = LocalTime.of(14, 30);
		// Define a custom format for the time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
		// Format the time and print it
		System.out.println("The event is at " + eventTime.format(formatter));

		// Name of a country: "United States"
		String country = "United States";
		System.out.println("The name of the country is: " + country);

		// Person's eye color: "Brown"
		String eye = "Brown";
		System.out.println("The eye colour is: " + eye);

		// Person's birthplace: "New York City"
		String birthPlace = "New York City";
		System.out.println("The birthplace is: " + birthPlace);

		// Distance between two cities: 200.5

		float distance = 200.5f;
		System.out.println("The distance is: " + distance);
	}

}
