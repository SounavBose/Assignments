package language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
	String name;
	double baseSalary;
	double experience;
	double yeaRating;

	public Employee(String empname, double baseSal, double exp, double rate) {

		name = empname;
		baseSalary = baseSal;
		experience = exp;
		yeaRating = rate;

	}
}

public class Assignment9 {

	public static void main(String[] args) {

		// Storing Employee Details
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Alice Johnson", 75000.0, 5.1, 4.2));
		employees.add(new Employee("Bob Smith", 68000.0, 3.2, 3.8));
		employees.add(new Employee("Carol Davis", 82000.0, 7.1, 4.5));
		employees.add(new Employee("David Brown", 90000.0, 10.2, 2.5));
		employees.add(new Employee("Eva Green", 60000.0, 2.4, 3.5));

		// Creating a map consisting of hikes
		Map<String, Double> hikePercentages = new HashMap<>();

		for (int i = 0; i < employees.size(); i++) {
			Employee emp = employees.get(i);

			double variablePayPercent;
			double bonus;

			if (emp.yeaRating >= 4.0) {
				variablePayPercent = 15.0;
				bonus = 1500;
			} else if (emp.yeaRating >= 3.0 && emp.yeaRating < 4.0) {
				variablePayPercent = 10.0;
				bonus = 1200;
			} else {
				variablePayPercent = 3.0;
				bonus = 300;
			}

			// Calculating Special Perks
			double reward = 0;

			if (emp.experience >= 5.0) {
				reward = 5000;
			}

			double hikeAmount = (emp.baseSalary * (variablePayPercent / 100)) + bonus + reward;
			double hikePercentage = (hikeAmount / emp.baseSalary) * 100;

			hikePercentages.put(emp.name, hikePercentage);
		}

		// Printing the data
		List<Map.Entry<String, Double>> entries = new ArrayList<>(hikePercentages.entrySet());
		for (int i = 0; i < entries.size(); i++) {
			Map.Entry<String, Double> entry = entries.get(i);
			System.out.printf("%s -> %.2f%% hike%n", entry.getKey(), entry.getValue());
		}
	}

}
