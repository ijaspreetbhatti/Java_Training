import java.util.Scanner;
class ScannerDemo{
	public static void main(String[] args) {

// Create a Scanner object
		Scanner scan = new Scanner(System.in);
		
// Ask the user to enter 2 numbers
		System.out.println("Please enter two numbers");

// Put the numbers into two variables
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();

		int result = firstNum + secondNum;

		System.out.println("Addtiton of no's is: " + result);
	}
}