package exercises;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		int i = 0;
		int secretNumber;
		int attempt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce a number that the CPU needs to guess: ");
		secretNumber = sc.nextInt();
		if(secretNumber >= 0 && secretNumber <= 100) {
			do {
				i = (int) (Math.random() * 100);
				System.out.println("The CPU tried the following number: " + i);
				if (i != secretNumber) {
					System.out.println("Wrong!");
				}
				attempt++;
			}
			while(i != secretNumber);
		}
		if (secretNumber >= 0 && secretNumber <= 100) {
			System.out.println("Congrats! The CPU finally managed to guess the number!\nSecret number: " + secretNumber + "\nAttempts: " + attempt);
			} else {
				System.out.println("Invalid number.");
			}
		if(secretNumber == 141) {
			System.out.println("\n\n\n\n\n\nTask Force 141"); //Little Easter Egg
		}
		sc.close();
	}
}