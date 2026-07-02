package midtermpackage;

import java.util.Scanner;

public class Question2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the state(ex: TX, LA, CA, etc): ");
		String state = input.nextLine();
		System.out.println("Enter item price: ");
		double price = input.nextDouble();
		
		double tax;
		
		switch (state) {
		case "TX" -> tax = 1.25;
		case "LA" -> tax = 1.25;
		case "CA" -> tax = 3.25;
		default -> tax = 0.5;
		}
		
		System.out.println("Item price is " + price);
		System.out.println("Shipping tax is " + tax);
	}
}
