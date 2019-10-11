import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

class Person {
	private String name;
	private Integer id;
	private String address;

	Person(String name, Integer id, String address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public Integer getId() {
		return this.id;
	}

	public String getAddress() {
		return address;
	}
}

class APIDemo {

	ArrayList list = new ArrayList();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean runFlag = true;
		APIDemo myList = new APIDemo();
		do {
			System.out.println("1. Insert Persons 2. Show All 3. Search 4. Delete Person 5. Sort 6. Exit");
			switch (scan.nextInt()) {
			case 1:
				if (myList.insertPerson())
					System.out.println("Inserted Successfully");
				break;
			case 2:
				myList.viewAll();
				break;
			case 3:
				myList.searchPerson();
				break;
			case 4:
				myList.deletePerson();
				break;
			case 5:
				myList.sortList();
				break;
			default:
				runFlag = false;
				System.out.println("Exitting...");
				break;
			}
		} while (runFlag);
	}

	boolean insertPerson() {
		String name;
		int id;
		String address;
		boolean successFlag = false;

		Scanner scan = new Scanner(System.in);

		System.out.println("How many persons you want to store?");
		Integer limit = scan.nextInt();
		scan.nextLine();

		for (int v = 1; v <= limit; v++) {

			System.out.println("Enter ID");
			id = scan.nextInt();
			scan.nextLine();

			System.out.println("Enter Name");
			name = scan.nextLine();

			System.out.println("Enter Address");
			address = scan.nextLine();

			successFlag = list.add(new Person(name, id, address));
		}
		return successFlag;
	}

	void viewAll() {
		for (Object person : list) {
			viewOne((Person)person);
		}
	}

	void viewOne(Person person) {
		System.out.println("Id: " + person.getId() + " Name : " + person.getName() + " Address: " + person.getAddress());
	}

	void searchPerson() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Id to search the person: ");
		Integer scn = scan.nextInt();
		for (Object person : list) {
			if(((Person)person).getId().equals(scn)){
				System.out.println("Person Found: ");
				viewOne((Person)person);
			}
		}
	}

	boolean deletePerson() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Id to delete the person: ");
		Integer scn = scan.nextInt();
		for (Object person : list) {
			if(((Person)person).getId().equals(scn)){
				list.remove(person);
				System.out.println("Person deleted!!!");
				return true;
			}
		}
		System.out.println("No one found!!!");
		return false;
	}

	void sortList() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. Sort by Id Ascending 2. Sort by Name Ascending 3. Sort by First Name 4. Sort by Last Name");
		Integer scn = scan.nextInt();

		switch(scn){
			case 1: Collections.sort(list,new SortByIdAsc());
					System.out.println("Sorted by Id Ascending");
					break;
			case 2: Collections.sort(list, new SortByNameAsc());
					System.out.println("Sorted by Name Ascending");
					break;
			case 3: Collections.sort(list,new SortByFirstName());
					System.out.println("Sorted by First Name");
					break;
			case 4: Collections.sort(list, new SortByLastName());
					System.out.println("Sorted by Last Name");
					break;
			default:
					break;
		}
	}
}

class SortByIdAsc implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2){
		return ((Person)ob1).getId().compareTo(((Person)ob2).getId());
	}
}


class SortByNameAsc implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2){
		return ((Person)ob1).getName().compareTo(((Person)ob2).getName());
	}
}

class SortByIdDsc implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2){
		return ((Person)ob2).getId().compareTo(((Person)ob1).getId());
	}
}

class SortByFirstName implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2){
		return (((((Person)ob1).getName()).split(" "))[0].compareTo(((((Person)ob2).getName()).split(" "))[0]));
	}
}

class SortByLastName implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2){
		if((((Person)ob1).getName()).contains(" ") && (((Person)ob2).getName()).contains(" "))
		return (((((Person)ob1).getName()).split(" "))[1].compareTo(((((Person)ob2).getName()).split(" "))[1]));
		else return 0;
	}
}