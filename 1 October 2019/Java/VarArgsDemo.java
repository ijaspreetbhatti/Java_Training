class VarArgsDemo{
	public static void main(String[] args) {
		

		// new VarArgsDemo().add();
		// new VarArgsDemo().add(2);
		new VarArgsDemo().add(23, 88);
	}



	void add(float var, int... values){
		int total = 0;

		for(int val : values){
			total += val;
		}

		System.out.println("Addition is : " + total);
	}



}