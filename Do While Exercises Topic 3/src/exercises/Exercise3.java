package exercises;
import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		int i = 1;
		int userN;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce a number: ");
		userN = sc.nextInt();
		do {
			System.out.print(i + "+");
			i++;
		}
		while (i != userN);
		System.out.println(i);
		sc.close();
	}
}