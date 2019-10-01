import java.util.Scanner;

class FactorialOfANumber {
	public static void main(String[] args) {
		int number, factorialOfTheNumber, tmp, multiple;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number to calculate the Factorial");
		number = scan.nextInt();

		factorialOfTheNumber = number;
		tmp = number;
		multiple = tmp - 1;
		do{
			factorialOfTheNumber *= multiple; 
			multiple -= 1;
		} while (multiple > 1);

		System.out.println("The Factorial of The Entered Number is: " + factorialOfTheNumber);
	}
}