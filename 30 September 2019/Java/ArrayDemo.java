class ArrayDemo{
	public static void main(String[] args) {
		int []values = new int[5];

		java.util.Scanner scan = new java.util.Scanner(System.in);

		System.out.println("Enter 5 numbers");

		for(int index = 0; index<values.length; index++){
			values[index] = scan.nextInt();
		}

		System.out.println("You entered: ");

		// for(int index = 0; index<values.length; index++){
		// 	System.out.println(values[index]);
		// }

		//OR with Java 5's enhanced for loop:

		for(int value : values){
			System.out.println(value);
		}





	}
}