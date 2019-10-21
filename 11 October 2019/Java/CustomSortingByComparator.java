//Custom Sorting example By Comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Laptop{
	private String name;
	private String series;
	private Integer id;

	Laptop(String name, String series, Integer id){
		this.name = name;
		this.series = series;
		this.id = id;
	} 

	public String getName(){
		return this.name;
	}

	public String getSeries(){
		return this.series;
	}

	public Integer getId(){
		return this.id;
	}

	@Override
	public String toString(){
		return this.name + ", " + " Series: " + this.series + ", id: " + this.id;
	}

}


//Define the logic for sorting laptops on the basis of id
	class SortById implements Comparator<Laptop>{
		@Override
		public int compare(Laptop ob1, Laptop ob2){
			return (ob1.getId().compareTo(ob2.getId()));
		}
	}


//Define the logic for sorting laptops on the basis of name
	class SortByName implements Comparator{
		@Override
		public int compare(Object ob1, Object ob2){
			return ((Laptop)ob1).getName().compareTo(((Laptop)ob2).getName());
		}
	}




	// ob1.compareTo(ob2)

	// < -1
	// == 0

	// > 1


class CustomSortingByComparator{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(new Laptop("Dtrt", "Latitude", 3134));
		list.add(new Laptop("Dell", "Latitude", 3500));
		list.add(new Laptop("Dell", "Inspiron", 2700));
		list.add(new Laptop("Hp", "EliteBook", 1234));

		System.out.println(list);


		//Sort the list
		Collections.sort(list, new SortByName());

		//Traverse through the list now
		System.out.println("After sorting: " + list);

	}
}