class GCDemo{
	static GCDemo t;
	double d;
	public static void main(String[] args) {
		
		GCDemo a = new GCDemo();
		GCDemo b = new GCDemo();
		GCDemo c = new GCDemo();

		a.t = b; //GCDemo.t = b;
		a.d = 199.00;
		b.t = c; //GCDemo.t = c;
		c.t = a; //GCDemo.t = a;

		a = b = c = null;

		System.out.println(GCDemo.t.d);


	}

	void doSomething(){

		GCDemo temp = new GCDemo();
		temp.d = 653.33;
		System.out.println(temp.d);
	}
}


// ref ---------> Object

// 				 Object

