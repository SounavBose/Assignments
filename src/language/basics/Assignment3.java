package language.basics;

public class Assignment3 {
	
	static  class Employees {
	    // Employee names
	    String emp1Name = "Bharath";
	    String emp2Name = "ABC";
	    String emp3Name = "XYZ";

	    // Employee IDs
	    int emp1Id = 1234;
	    int emp2Id = 1235;
	    int emp3Id = 1236;
	}

	static class EmpGroups {
	    // Arrays to hold names and IDs
	    String[] names = new String[3];
	    int[] ids = new int[3];
	}

	public static void main(String[] args) {
		        // Create Employees and EmpGroups objects
		        Employees emp = new Employees();
		        EmpGroups group = new EmpGroups();

		        // Directly copy data from Employees to arrays in main()
		        group.names[0] = emp.emp1Name;
		        group.names[1] = emp.emp2Name;
		        group.names[2] = emp.emp3Name;

		        group.ids[0] = emp.emp1Id;
		        group.ids[1] = emp.emp2Id;
		        group.ids[2] = emp.emp3Id;

		        // Display employee details (no loops)
		        System.out.println("Employee Name: " + group.names[0] + ", Employee ID: " + group.ids[0]);
		        System.out.println("Employee Name: " + group.names[1] + ", Employee ID: " + group.ids[1]);
		        System.out.println("Employee Name: " + group.names[2] + ", Employee ID: " + group.ids[2]);
		}

}



