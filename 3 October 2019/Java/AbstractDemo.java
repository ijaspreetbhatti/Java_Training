class AbstractDemo{
	public static void main(String[] args) {

		Arjun arjun = new Arjun();

		arjun.run();
		arjun.breathe();
		// arjun.sing(); Error

		// Vaishnavi v = new Vaishnavi();

		// // v.run();
		// v.breathe();
		// v.sing();
	}
}

abstract class Human{ 
	 abstract void run();
	 abstract void eat();

	 abstract static void sleep(){

	 }
	
	void breathe(){
		System.out.println("Generic breathe...");
	}
} 


class Arjun extends Human{

	@Override
	void sleep(){

	}

	@Override
	public void eat(){
		System.out.println("Arjun's eat...");
	}

	@Override
	public void run(){
		 // super.run();
		System.out.println("Arjun's own way of running...");
	}
}

abstract class Vaishnavi extends Human{

	// void breathe(){
	// 	System.out.println("Vaishnavi's own breathe...");
	// }

	void sing(){
		System.out.println("Vaishnavi's sing...");
	}
}








