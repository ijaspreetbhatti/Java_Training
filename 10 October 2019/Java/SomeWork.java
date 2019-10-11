class Human{
	
int age;
String name;

Human(int age, String name){
	this.name = name;
	this.age = age;
}

int getAge(){
	return this.age;
}

String getName(){
	return this.name;
}


@Override
public String toString(){
	return "Hi there," + getName() + " here and I am " + getAge() + " years old";
}

}

class SomeWork{
	public static void main(String[] args) {
		Human ref = new Human(23, "Ramesh");
		Human ot = new Human(21, "Sagar");

		System.out.println(ot);


		Integer i = 78628;

		System.out.println(i.toString());//78628




}
}