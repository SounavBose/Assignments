package language.basics;

public class Assignment2 {

	public static void main(String[] args) {

		// Declare the 3D array having 5 semesters, 6 subjects and 2 values
		String[][][] data = new String[5][6][2];

		// Initialize the data for 1st Semester
		data[0][0][0] = "Mathematics I";
		data[0][0][1] = "Pass(78)";
		data[0][1][0] = "Physics";
		data[0][1][1] = "Pass(85)";
		data[0][2][0] = "Chemistry";
		data[0][2][1] = "Fail(21)";
		data[0][3][0] = "Computer Programming";
		data[0][3][1] = "Pass(74)";
		data[0][4][0] = "Engineering Drawing";
		data[0][4][1] = "Pass(88)";
		data[0][5][0] = "Basic Electrical Eng.";
		data[0][5][1] = "Pass(79)";

		// Initialize the data for 2nd Semester
		data[1][0][0] = "Mathematics II";
		data[1][0][1] = "Pass(82)";
		data[1][1][0] = "Mechanics";
		data[1][1][1] = "Pass(77)";
		data[1][2][0] = "Environmental Sci.";
		data[1][2][1] = "Pass(93)";
		data[1][3][0] = "Basic Electronics";
		data[1][3][1] = "Fail(19)";
		data[1][4][0] = "Engineering Physics";
		data[1][4][1] = "Fail(24)";
		data[1][5][0] = "Engineering Graphics";
		data[1][5][1] = "Pass(90)";

		// Initialize the data for 3rd Semester
		data[2][0][0] = "Data Structures";
		data[2][0][1] = "Pass(88)";
		data[2][1][0] = "Discrete Mathematics";
		data[2][1][1] = "Pass(81)";
		data[2][2][0] = "Digital Electronics";
		data[2][2][1] = "Pass(76)";
		data[2][3][0] = "Operating Systems";
		data[2][3][1] = "Fail(32)";
		data[2][4][0] = "Signals and Systems";
		data[2][4][1] = "Pass(85)";
		data[2][5][0] = "Object-Oriented Prog.";
		data[2][5][1] = "Pass(78)";

		// Initialize the data for 4th Semester
		data[3][0][0] = "Algorithms";
		data[3][0][1] = "Pass(91)";
		data[3][1][0] = "Computer Networks";
		data[3][1][1] = "Pass(73)";
		data[3][2][0] = "Database Systems";
		data[3][2][1] = "Fail(19)";
		data[3][3][0] = "Microprocessors";
		data[3][3][1] = "Pass(80)";
		data[3][4][0] = "Communication Eng.";
		data[3][4][1] = "Pass(76)";
		data[3][5][0] = "Software Engineering";
		data[3][5][1] = "Pass(87)";

		// Initialize the data for 5th Semester

		data[4][0][0] = "Probability & Stats";
		data[4][0][1] = "Pass(86)";
		data[4][1][0] = "Machine Learning";
		data[4][1][1] = "Pass(88)";
		data[4][2][0] = "Compiler Design";
		data[4][2][1] = "Pass(84)";
		data[4][3][0] = "Theory of Computation";
		data[4][3][1] = "Pass(95)";
		data[4][4][0] = "Embedded Systems";
		data[4][4][1] = "Pass(73)";
		data[4][5][0] = "Computer Graphics";
		data[4][5][1] = "Pass(90)";

		// Printing out the values for Semester 2, Subject 4 name
		System.out.println("Semester 2 Subject 4: " + data[1][3][0]);
	
		// Printing out the values for Semester 2, Subject 5 name
		System.out.println("Semester 2 Subject 5: " + data[1][4][0]);
		
		// Print Semester 4 Subject 3 marks/status
		System.out.println("Semester 4 Subject 3 Marks: " + data[3][2][1]);
		
		// Print Semester 4 Subject 6 marks/status
        System.out.println("Semester 4 Subject 6 Marks: " + data[3][5][1]);
	}

}
