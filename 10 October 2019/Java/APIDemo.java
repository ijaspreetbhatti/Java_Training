import java.util.ArrayList;
import java.util.Scanner;
class Person{
	private String name;
	private Integer id;

	Person(String name, Integer id){
		this.name = name;
		this.id = id;
	}

	public String getName(){
		return this.name;
	}

	public Integer getId(){
		return this.id;
	}
}

class APIDemo{
	public static void main(String[] args) {
		String name;
		int id;

		ArrayList list = new ArrayList();

		Scanner scan = new Scanner(System.in);

		System.out.println("How many persons you want to store?");
		Integer limit = scan.nextInt();
		scan.nextLine();

		for(int v = 1; v <= limit; v++){
			System.out.println("Enter name");
			name = scan.nextLine();

			System.out.println("Enter id");
			id = scan.nextInt();
			scan.nextLine();

			list.add(new Person(name, id));

		}

		//Print all names
		System.out.println("We have the following persons saved:");

		for(Object ob : list){
			System.out.println(((Person)ob).getName());
		}
	}
}