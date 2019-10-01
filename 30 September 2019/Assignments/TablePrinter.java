import java.util.Scanner;

class TablePrinter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number, limit, multiple;

		System.out.println("Enter the number to print the table for: ");
		number = scan.nextInt();

		System.out.println("Enter the limit for the table: ");
		limit = scan.nextInt();

		System.out.println("Table of " + number + " is: ");
		for (multiple = 1; multiple <= limit; multiple++) {
			System.out.println(number + " * " + multiple + " = " + (number*multiple));
		}
	}
}