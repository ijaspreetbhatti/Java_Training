enum PizzaSize{SMALL(2), MEDIUM(4), LARGE(8), XLARGE(12);

	private int serving;

	PizzaSize(int serving){
		this.serving = serving;
	}

	public int getServing(){
		return this.serving;
	}

}

class EnumDemo{
	public static void main(String[] args) {
		// PizzaSize size = PizzaSize.SMALL;

		// System.out.println(size);

		// size = PizzaSize.MEDIUM;

		// System.out.println(size);
System.out.println("We have the below sizes available:");

	PizzaSize []sizes = PizzaSize.values();
		for(PizzaSize size : sizes){
			System.out.println(size + "serves " + size.getServing() + " people");
		}




	}
}