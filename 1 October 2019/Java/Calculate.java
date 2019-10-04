class Calculate{
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);

		int firstNum = 0, secondNum = 0, result;

		System.out.println("Enter two numbers");

		firstNum = scan.nextInt();
		secondNum = scan.nextInt();

		result = firstNum + secondNum;

		System.out.println("Addition is : " + result);
	}
}