class CalculateByUsingMethods{
	public static void main(String[] args) {
		new CalculateByUsingMethods().add();
	}


	void add(){
		java.util.Scanner scan = new java.util.Scanner(System.in);

		int firstNum = 0, secondNum = 0, result;

		System.out.println("Enter two numbers");

		firstNum = scan.nextInt();
		secondNum = scan.nextInt();

		result = firstNum + secondNum;

		System.out.println("Addition is : " + result);
	}
}