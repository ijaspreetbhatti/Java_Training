package neha;

import mayank.My;
class Some{
	public static void main(String[] args) {
		Other ot = new Other();
		ot.doSomething();
	}
}


class Other extends My{
	void doSomething(){
		System.out.println("Inside doSomething...");

		//Call met of My

		// My my = new My();

		// my.met();

		this.met();



	}
}















	// Scope

	// 	private
	// 	public
	// 	protected
	// 	package-private(Not a keyword)


