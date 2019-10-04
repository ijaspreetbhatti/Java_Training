class InterfaceDemo{
	public static void main(String[] args) {

		Arjun arjun = new Arjun();

		arjun.run();
		arjun.breathe();

	}
}

interface Warrior{
	void fight();
}

interface Human{ 

	 int LEGS = 2;

	 void run();
	 void eat();
	 void breathe();

	 default void cry(){
	 	System.out.println("Sub classes would have a choice to override this");
	 }
} 

interface Employee extends Human{
	void workForWages();
}


class Arjun implements Human, Warrior{

	@Override
	public void fight(){
		System.out.println("Arjun fights well...");
	}

	@Override
	public void eat(){
		System.out.println("Arjun's eat...");
	}

	@Override
	public void run(){
		System.out.println("Arjun's own way of running...");
	}

	@Override
	public void breathe(){
		System.out.println("Arjun's breathe...");
	}

}

class Vaishnavi implements Employee{

	@Override
	public void breathe(){
		System.out.println("Vaishnavi's own breathe...");
	}

	@Override
	public void eat(){
		System.out.println("Vaishnavi's own eat...");
	}

	@Override
	public void run(){
		System.out.println("Vaishnavi's own run...");
	}

	@Override
	public void workForWages(){
		System.out.println("Vaishnavi's own workForWages...");
	}

	void sing(){
		System.out.println("Vaishnavi's sing...");
	}
}








