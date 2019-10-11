class GenericsStarter{
	public static void main(String[] args) {
		java.util.Set<String> set = new java.util.HashSet<>();

		set.add("Sony");
		set.add("HTC");
		set.add("Apple");
		set.add("Google");
		set.add("Motorola");
		set.add("Samsung");

		// set.add(776); Fails Post Java 5

		System.out.println("Contents are: " + set);
	}
}