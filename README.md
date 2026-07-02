# COSC-1436-Midterm-Question1
import java.util.Scanner;

public class COSC-1436-Midterm-Question1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many oz of milk the child drank? ");
		double milk = input.nextDouble();
		
		if (milk >= 6) {
			System.out.println("Baby will sleep well for 5 hours.");
		} else {
			System.out.println("Baby will not sleep well. So be prepared.");
		}
	}
}
