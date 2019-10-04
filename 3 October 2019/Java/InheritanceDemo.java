class InheritanceDemo{
	public static void main(String[] args) {

		Arjun arjun = new Arjun();

		arjun.run();
		arjun.breathe();
		// arjun.sing(); Error

		Vaishnavi v = new Vaishnavi();

		// v.run();
		v.breathe();
		v.sing();
	}
}


class Human{ // Cannot be inherited now
	 void run(){
		System.out.println("Generic run...");
	}

	final void breathe(){
		System.out.println("Generic breathe...");
	}
} 

class Arjun extends Human{

	@Override
	public void run(){
		 // super.run();
		System.out.println("Arjun's own way of running...");
	}
}

class Vaishnavi extends Human{

	// void breathe(){
	// 	System.out.println("Vaishnavi's own breathe...");
	// }

	void sing(){
		System.out.println("Vaishnavi's sing...");
	}
}








