class ExceptionScenarios{
	void func(){

		try {
			//Arithemetic Vulnerability here...
			//FNF Vulnerability here...
		}
		catch(ArithmeticException ae){
			//Handling code here...	
		}
		catch(java.io.FileNotFoundException fe){
			//Handling code here...
		}

		// OR

		try {
			//Arithemetic Vulnerability here...
		}
		catch(ArithmeticException ae){
			//Handling code here...	
		}
		try{
			//FNF Vulnerability here...
		}
		catch(java.io.FileNotFoundException fe){
			//Handling code here...
		}






		try {
			//Some IO Vulnerability here
			//FNF Vulnerability here...
		}
		catch(java.io.FileNotFoundException fe){
			//Handling code here...
		}
		catch(java.io.IOException ae){
			//Handling code here...	
		}


//Not recomended
		try {
			//Some IO Vulnerability here
			//FNF Vulnerability here...
		}
		catch(Exception fe){
			fe.ownMethodOfFileNotFoundExceptioClass();
		}
		

		
		


	}
}