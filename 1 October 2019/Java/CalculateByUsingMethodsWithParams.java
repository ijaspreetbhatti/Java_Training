class CalculateByUsingMethodsWithParams{
	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		int firstNum , secondNum;

		System.out.println("Enter two numbers");

		firstNum = scan.nextInt();
		secondNum = scan.nextInt();


		new CalculateByUsingMethodsWithParams().add(firstNum, secondNum);
	}


	void add(int firstNum, int secondNum){

		int result = firstNum + secondNum;

		System.out.println("Addition is : " + result);
	}
}