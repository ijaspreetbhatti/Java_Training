class ConstructorInheritanceDemo{
	public static void main(String[] args) {
		A b = new A();
	}
}

class B{
	B(){
		System.out.println("Inside B...");
	}
}

class A extends B{


	

	A(){
		System.out.println("Inside constructor");
	}

	{
		System.out.println("init block-1");
	}

	void func(){
		System.out.println("Inside func...");
	}

	{
		System.out.println("init block-2");
	}

	static {
		System.out.println("static init block");
	}


}









// class A{
// 	A(boolean var){
// 		System.out.println("Inside A(boolean)");
// 	}
// }

// class B extends A{
// 	B(){
// 		super(false);
// 		System.out.println("Inside B...");
// 	}

// 	B(boolean var){
// 		this();
// 		System.out.println("Inside B(boolean)...");
// 	}
// }