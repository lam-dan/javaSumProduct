import java.util.Scanner;

public class SumProduct {
	public static void main (String[] args){
		String input;
		int sum;
		int num1;
		int num2;
		int product;
		Scanner terminal = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		while (!terminal.hasNextInt()) {
			input = terminal.next();
			System.out.printf("\"%s\" is not a valid number.\n", input);
			System.out.println("Please enter a valid number:");
		}
		num1 = Integer.parseInt(terminal.next());
		System.out.println("You have entered "+ num1 + ".");

		System.out.println("Please enter another number: ");
		while (!terminal.hasNextInt()) {
			input = terminal.next();
			System.out.printf("\"%s\" is not a valid number.\n", input);
			System.out.println("Please enter a valid number:");
		}
		num2 = Integer.parseInt(terminal.next());
		System.out.println("You have entered "+ num2 + ".");
		System.out.println("You have entered "+ num1 + " and " + num2 + ".");
		sum = num1 + num2;
		product = num1 * num2;
		System.out.println("The sum of these numbers are: " + sum + ".");
		System.out.println("The product of these numbers are: " + product + ".");
		}
}
	
