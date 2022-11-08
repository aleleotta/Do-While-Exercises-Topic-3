package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		int userN; //All necessary variables declared and assigned here.
		int i = 0;
		int result = 0;
		int aux = 0;
		Scanner sc = new Scanner(System.in); //Scanner declared.
		System.out.println("This program will show you the multiplication table of any number you introduce.\n");
		System.out.println("Introduce a number: ");
		userN = sc.nextInt(); //User input
		do {
			i++; //Second number increment
			result = i * userN; //The whole operation
			System.out.println(userN + " * " + i + " = " + result); //Operation is printed.
			aux++; //Counter increment
		}
		while(aux <= 9); //Determines the times the loop will run.
		sc.close(); //Closing scanner.
	}
}