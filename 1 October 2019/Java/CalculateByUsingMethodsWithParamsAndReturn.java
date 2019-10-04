class CalculateByUsingMethodsWithParamsAndReturn{
	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		int firstNum , secondNum;

		System.out.println("Enter two numbers");

		firstNum = scan.nextInt();
		secondNum = scan.nextInt();


	 System.out.println("Addition is : " + new CalculateByUsingMethodsWithParamsAndReturn().add(firstNum, secondNum));
	
	}


	int add(int firstNum, int secondNum){

		return firstNum + secondNum;


	}
}