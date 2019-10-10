// In a Pre Java 4 scenerio

// class LogicOPR{
// 	void work(int value){
// 		if(value > 0){
// 			// Do the actual work
// 		}
// 		else{
// 			//We should never have been here
// 		} 
// 	}
// }

//Assertions - assert

//Post Java 4:
Thread
class AssertionsDemo{
	public static void main(String[] args) {
		new AssertionsDemo().work(-10);
	}


	void work(int value){
assert(value > 0) : value; //If false, AssertionError is thrown which you should not try to handle
assert(value == 0) : System.out.println("Not the right value");
assert(value = 0) : value;
assert(value);
assert(value > 0) : AssertionsDemo ref;
assert(value > 0) : new AssertionsDemo();

assert(value > 10): func(value);

assert(value <= 987): sub(value); 
			System.out.println("Proceed with normal work here...");

	}
	void sub(int value){
		System.out.println(value);
	}

	int func(int value){
		System.out.println(value);
		return value;
	}

}