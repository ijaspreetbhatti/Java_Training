// hashCode(); //As a mechanism to enter a particular bucket
//equals();
import java.util.HashMap;
class Student{
	private String name;
	private Integer id;

	Student(String name, Integer id){
		this.name = name;
		this.id = id;
	}

	String getName(){
		return this.name;
	}

	Integer getId(){
		return this.id;
	}

	@Override
	public String toString(){
		return this.getName();
	}

	@Override
	public int hashCode(){
		return this.id;
	}

	@Override
	public boolean equals(Object ref){
		return this.getId().equals(((Student)ref).getId());
	}

}


class HashCodeEqualsDemo{
	public static void main(String[] args) {
		HashMap<Student, String> map = new HashMap<>();

		Student first = new Student("Aditya", 678);
		Student second = new Student("Abhishek", 764);
		Student third = new Student("Poorna", 121);
		Student fourth = new Student("Divya", 4501);

		map.put(first, "CSE");
		map.put(third, "IT");
		map.put(second, "IT"); 
		map.put(fourth, "MBA");
		map.put(new Student("Poorna", 121), "IT");
		map.put(new Student("Kaustav", 443), "CSE");

		System.out.println("Contents are: " + map);


	}
}

