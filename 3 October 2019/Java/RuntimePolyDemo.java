class RuntimePolyDemo{
	public static void main(String[] args) {
		// Human ref = new Arjun();

		// ref.eat();

		// ref = new Vaishnavi();

		// ref.eat();

		//ref.sing(); //Error:  Calling Viashnavi's own method


		Human []arr = new Human[3];

		arr[0] = new Arjun();
		arr[1] = new Vaishnavi();
		arr[2] = new Vaishnavi();

		for(Human ref : arr){
			ref.eat();
			ref.run();

			if(ref instanceof Vaishnavi){
				((Vaishnavi)ref).sing();
			}
		}
		




	}
}
interface Human{ 
	 void run();
	 void eat();
} 

class Arjun implements Human{

	@Override
	public void eat(){
		System.out.println("Arjun's eat...");
	}

	@Override
	public void run(){
		System.out.println("Arjun's own way of running...");
	}

}

class Vaishnavi implements Human{

	@Override
	public void eat(){
		System.out.println("Vaishnavi's own eat...");
	}
	@Override
	public void run(){
		System.out.println("Vaishnavi's own run...");
	}
	void sing(){
		System.out.println("Vaishnavi's sing...");
	}
}








