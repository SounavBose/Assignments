package language.basics;

public class Assignment6 {

	public static void main(String[] args) {
		//Declare names and marks array
		String[] names = {"Suresh", "Mahesh", "Naresh"};
		int[] marks = {75, 80, 82};
		
		//Appending the marks by 10
		int[] updatedMarks = { marks[0]+10, marks[1]+10, marks[2]+10 };
		
		//Calculating the Average
		double average = ((updatedMarks[0] + updatedMarks[1] + updatedMarks[2])/3);
		
		//Printing the data
		System.out.println(names[0] + ": " + updatedMarks[0]);
		System.out.println(names[1] + ": " + updatedMarks[1]);
		System.out.println(names[2] + ": " + updatedMarks[2]);
		System.out.println("Average Marks: "+ average);

	}

}
