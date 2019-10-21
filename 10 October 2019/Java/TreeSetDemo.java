class TreeSetDemo{
	public static void main(String[] args) {
		java.util.TreeSet set = new java.util.TreeSet();

		set.add("IBM");
		set.add("Capgemini");
		set.add("TCS");
		set.add("Amazon");
		if(set.add("ibm")){
			System.out.println("Added");
		}

		System.out.println(set);
	}
}