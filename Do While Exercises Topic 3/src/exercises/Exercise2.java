package exercises;

public class Exercise2 {
	public static void main(String[] args) {
		int i = 0; //i variable gets declared and initialized with an even number.
		System.out.println("Program will print even numbers up to 200."); //Program tells user what is going to happen.
		do { //Do this at least once but keep going until i reaches 200.
			System.out.println("Current number: " + i); //i printing at every loop.
			i = i + 2; //Only even numbers will show up by summing up by 2.
		}
		while (i <= 200); //Loop condition
	}
}