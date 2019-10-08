class MultiCatchDemo{
	public static void main(String[] args) {
		new MultiCatchDemo().work();
	}


	void work(){
		try{
			//Vulnerable code here regarding IO,AE
		}
		catch(IOException ie){
			//Handle the IOException here
		}
		catch(ArithmeticException ae){
			//Hande AE here
		}


		// OR Post Java 7

		try{
			//Vulnerable code here regarding IO
			//Vulnerable code here regarding AE
		}
		catch(IOException | ArithmeticException ie){
			//Handle the IOException or ArithmeticException here
		}




	}
}