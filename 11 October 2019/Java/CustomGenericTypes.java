class MyDemoClass<E>{

	E value;

	MyDemoClass(E value){
		this.value = value;
	}

	E getValue(){
		return this.value;
	}
}

class MyDemoClass2<E, T>{

	E value;
	T otherValue;

	MyDemoClass2(E value, T otherValue){
		this.value = value;
		this.otherValue = otherValue;
	}

	E getValue(){
		return this.value;
	}

	T getOtherValue(){
		return this.otherValue;
	}
}


class CustomGenericTypes{
	public static void main(String[] args) {
		// MyDemoClass<Integer> ref = new MyDemoClass<>(7890);

		// String i = ref.getValue();

		// System.out.println("Value : " + i);

		MyDemoClass2<Integer, String> ref = new MyDemoClass2<>(7890, "IBM Learning");

		Integer i = ref.getValue();
		String var = ref.getOtherValue();

		System.out.println("Value : " + i);
		System.out.println("Other Value : " + var);

	}
}