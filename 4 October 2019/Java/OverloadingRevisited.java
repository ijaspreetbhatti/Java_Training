
class OverloadingRevisited{
	public static void main(String[] args) {

		int var = 761;

		// int -> Integer -> Long

		//int -> Integer -> Object

	OverloadingRevisited ref = new OverloadingRevisited();

	ref.func(var);

	// Human h = new Human();

	// Human ref = new Arjun(); //IS-A

	}


	void func(Long b){
		System.out.println("Long...");
	}

	void func(Object b){
		System.out.println("Object");
	}
}