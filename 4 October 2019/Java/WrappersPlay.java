class WrappersPlay{
	public static void main(String[] args) {
		
		// Integer var = new Integer("543");
		// System.out.println("Var: " + var);

		// passToDb(var.toString());

		//Post Java 5 Code:

		Integer var = 767;

		var++;
		
		//This happens automatically:

		// int temp = var.intValue(); //UnBox

		// temp++;

		// var = new Integer(temp); //AutoBox

		System.out.println("Value: " + var);

	// Pre Java 5 Code:

		// Integer var = new Integer("767");

		// int temp = var.intValue(); //Unwrap

		// temp++; //Operation

		// var = new Integer(temp); //Rewrap

		// System.out.println("Value : " + var);

		int v = 767;

		v++;

		System.out.println(var);




















	}
}

	// boolean - Boolean
	// byte - Byte
	// short - Short
	// char - Character
	// int - Integer
	// long - Long
	// float - Float
	// double - Double




