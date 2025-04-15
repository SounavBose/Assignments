package language.basics;

import java.util.HashMap;
import java.util.Map;

public class Assignment5 {
	public static void main(String[] args) {

		Map<String, Map<String, Map<String, String>>> allData = new HashMap<>();

		// ========== StudentDetails ==========
		Map<String, Map<String, String>> studentDetails = new HashMap<>();

		studentDetails.put("S12345",
				Map.of("Name", "John Doe", "Age", "20", "Gender", "Male", "Roll Number", "S12345", "Grade", "A",
						"Major", "Computer Science", "GPA", "3.8", "Email", "john@example.com", "Contact Number",
						"9876543210", "Address", "123 Elm St"));

		studentDetails.put("S12346",
				Map.of("Name", "Jane Smith", "Age", "21", "Gender", "Female", "Roll Number", "S12346", "Grade", "B",
						"Major", "Mathematics", "GPA", "3.5", "Email", "jane@example.com", "Contact Number",
						"9876543211", "Address", "456 Oak St"));

		studentDetails.put("S12347",
				Map.of("Name", "Mike Brown", "Age", "22", "Gender", "Male", "Roll Number", "S12347", "Grade", "A",
						"Major", "Physics", "GPA", "3.9", "Email", "mike@example.com", "Contact Number", "9876543212",
						"Address", "789 Pine St"));

		allData.put("StudentDetails", studentDetails);

		// ========== EmployeeDetails ==========
		Map<String, Map<String, String>> employeeDetails = new HashMap<>();

		employeeDetails.put("E001",
				Map.of("Name", "Alice Green", "Age", "30", "Gender", "Female", "Department", "Engineering", "Position",
						"Software Engineer", "Salary", "75,000", "Email", "alice@example.com", "Contact Number",
						"9876543213"));

		employeeDetails.put("E002",
				Map.of("Name", "Bob Johnson", "Age", "35", "Gender", "Male", "Department", "Marketing", "Position",
						"Marketing Manager", "Salary", "85,000", "Email", "bob@example.com", "Contact Number",
						"9876543214"));

		employeeDetails.put("E003",
				Map.of("Name", "Carol White", "Age", "28", "Gender", "Female", "Department", "Sales", "Position",
						"Sales Executive", "Salary", "65,000", "Email", "carol@example.com", "Contact Number",
						"9876543215"));

		allData.put("EmployeeDetails", employeeDetails);

		// ========== Product Details ==========
		Map<String, Map<String, String>> productDetails = new HashMap<>();

		productDetails.put("P001",
				Map.of("Name", "Laptop", "Category", "Electronics", "Price", "$1,200", "Stock Quantity", "50",
						"Supplier", "Tech Supplies", "Warranty", "2 years", "Rating", "4.5", "Manufacturing Date",
						"15/1/2023", "Expiry Date", "15/1/2025"));

		productDetails.put("P002",
				Map.of("Name", "Desk Chair", "Category", "Furniture", "Price", "$150", "Stock Quantity", "100",
						"Supplier", "Office Depot", "Warranty", "1 year", "Rating", "4", "Manufacturing Date",
						"10/2/2023", "Expiry Date", "N/A"));

		productDetails.put("P003",
				Map.of("Name", "Coffee Maker", "Category", "Kitchen", "Price", "$75", "Stock Quantity", "200",
						"Supplier", "KitchenWorld", "Warranty", "6 months", "Rating", "4.2", "Manufacturing Date",
						"20/3/2023", "Expiry Date", "20/3/2024"));

		allData.put("Product Details", productDetails);

		// ========== Printing Office Depot ==========
		Map<String, Map<String, String>> prodDetails = allData.get("Product Details");
		Map<String, String> officeDepotProduct = prodDetails.get("P002"); // getting the office depot product

		System.out.println("Product ID: P002");
		System.out.println("Product Data: " + officeDepotProduct);
	}
}
