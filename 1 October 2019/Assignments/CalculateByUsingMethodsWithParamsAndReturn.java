class CalculateByUsingMethodsWithParamsAndReturn {
	int firstNum, secondNum;

	public static void main(String[] args) {
		new CalculateByUsingMethodsWithParamsAndReturn().doAddition();
	}

	void doAddition() {
		this.getDataFromUser();
		System.out.println("Addition is : " + this.add(this.firstNum, this.secondNum));
	}

	void getDataFromUser() {
		java.util.Scanner scan = new java.util.Scanner(System.in);

		System.out.println("Enter two numbers");
		this.firstNum = scan.nextInt();
		this.secondNum = scan.nextInt();
	}

	int add(int firstNum, int secondNum) {
		return firstNum + secondNum;
	}
}