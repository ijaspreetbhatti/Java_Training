class CalculateAddition{
	int add(int firstNum, int secondNum){
		return firstNum + secondNum;
	}

	void add(int firstNum, int secondNum, int thirdNum){
		int result = firstNum + secondNum + thirdNum;
	}

	int add(int firstNum, int secondNum, int thirdNum, int fourthNum){
		return firstNum + secondNum + thirdNum + fourthNum;
	}
}


class CalculateOPR{

	public static void main(String[] args) {
		CalculateAddition cal = new CalculateAddition();

		System.out.println(cal.add(67, 88));
	}
}