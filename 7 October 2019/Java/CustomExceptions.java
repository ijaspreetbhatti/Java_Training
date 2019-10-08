class NumberNot10Exception extends RuntimeException{
	String numberNot10(){
		return "Sorry, mobiles numbers should be of 10 in length";
	}
}


class CustomExceptions{
	public static void main(String[] args)  {
		String valueFromUser = "6678999";

		if(valueFromUser.length() != 10){

			throw new NumberNot10Exception();
			
		}
	}
}