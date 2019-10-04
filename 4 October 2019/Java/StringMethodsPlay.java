class StringMethodsPlay{
	public static void main(String[] args) {
		
		String var = "We are doing JAVA";

		System.out.println(var);

		var = var.concat("at IBM");

		System.out.println(var);

		String newVar = var.toLowerCase();

		System.out.println(newVar);

		System.out.println("String length : " + newVar.length());

		System.out.println("Character at index 4 :" + newVar.charAt(4));


		System.out.println(newVar.substring(10));
		System.out.println(newVar.substring(10, 16));


		System.out.println("Tokens:");
		String []arr =  newVar.split("a");

		for (String value : arr) {
			System.out.println(value);
		}


// 	We are doing JAVA
// 			at IBM
// var------>		We are doing JAVA at IBM
//newVar----->	we are doing java at ibm

	}
}