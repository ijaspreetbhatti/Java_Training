class SwitchCaseDemo{
	public static void main(String[] args) {
		

		int var = 15;
		final int value = 15;
		switch (var) {
			case 10:
				System.out.println("TEN");
				break;
			case value:
				System.out.println("FIFTEEN");
				break;
			case 2:
				System.out.println("TWO");
				break;
			default:
				System.out.println("No Match Found...");
		}
	}
}