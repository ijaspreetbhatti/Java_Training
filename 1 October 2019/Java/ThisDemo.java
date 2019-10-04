class ThisDemo{

	 char var;
	 static int i;
	public static void main(String[] args) {

		new ThisDemo().func(); //ThisDemo.func();


		// System.out.println("Value: " + var); // Error


		 // ThisDemo ref = new ThisDemo();
		 // ThisDemo ref2 = new ThisDemo();

		 // ref2.i = 8765;

		 // System.out.println(ref.i); // 8765

		// System.out.println(ThisDemo.i);
		// System.out.println(i);//ThisDemo.i

		// System.out.println(ref.i); // ThisDemo.i

		

		// ref.var = 't';

		// ref.doSomething();

	}

	void doSomething(){
		System.out.println(i); // Works as ThisDemo.i

		System.out.println("Value: " + this.var); //this.var

		func(); //this.func()

		// System.out.println("Inside doSomething...");
	}

	static void func(){
		this.var = 'r'; //Still fails
		
		System.out.println("Inside func...");
	}

}



//ClassName.staticMember;


//Some.main();




