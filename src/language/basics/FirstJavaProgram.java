package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class FirstJavaProgram {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Hello World!");

		System.out.format("Total Bill is %.2f", 100.89829131);
		System.out.println();
		System.out.append("My name is Sounav Bose ").append("I am 24");
		System.out.println();
		//
		System.out.write(65);
		System.out.println();
		
		Logger log = Logger.getLogger("My Logger");
		log.warning("Please Check");
		
		System.err.println("ERROR: Expected result is not matching with actual result");
		
		PrintWriter writer = new PrintWriter("C:\\AutomationTraining\\AutomationProject\\Logs.txt");
		writer.println(LocalDateTime.now()+" Line 23 is running");
		writer.println(LocalDateTime.now()+" Line 24 is running");
		writer.println(LocalDateTime.now()+" Completed");
		writer.close();
	}

}