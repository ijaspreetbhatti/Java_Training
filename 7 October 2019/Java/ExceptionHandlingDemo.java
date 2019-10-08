
// Exception Handling 

class Calculate {
	void div(int firstNum, int secondNum) {
		int result = 0;
		try {
			result = firstNum / secondNum;
			System.out.println("Division : " + result);
		} catch (ArithmeticException ae) {
			System.out.println("Divide by 0 not possible...");
		}

	}
}

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		new Calculate().div(45, 0);
	}
}

// Gaurded Region
// try{
// //Vulnerable code here...
// }
// catch(AppropriateExceptionHandler ref){
// //Do something with it here...
// }
// #Control resumes
