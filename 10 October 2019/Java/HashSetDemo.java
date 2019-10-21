class HashSetDemo{
	public static void main(String[] args) {
		java.util.HashSet set = new java.util.HashSet();

		set.add("IBM");
		set.add(664);
		set.add(new Human(66, "Aman"));
		set.add('t');
		if(set.add("ibm")){
			System.out.println("Added");
		}

		System.out.println(set);
	}
}