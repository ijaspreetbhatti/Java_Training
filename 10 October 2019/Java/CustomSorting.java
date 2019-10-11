//Custom Sorting example

import java.util.ArrayList;
import java.util.Collections;

class Laptop implements Comparable {
	private String name;
	private String series;
	private Integer id;

	Laptop(String name, String series, Integer id) {
		this.name = name;
		this.series = series;
		this.id = id;
	}

	@Override
	public int compareTo(Object ob) {
		// Sort Laptops on the basis of id
		// return this.id.compareTo(((Laptop)ob).id);
		return ((Laptop) ob).id.compareTo(this.id);
	}

	@Override
	public String toString() {
		return this.name + ", " + " Series: " + this.series + ", id: " + this.id;
	}

	// ob1.compareTo(ob2)

	// < -1
	// == 0

	// > 1
}

class CustomSorting {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(new Laptop("Dtrt", "Latitude", 3134));
		list.add(new Laptop("Dell", "Latitude", 3500));
		list.add(new Laptop("Dell", "Inspiron", 2700));
		list.add(new Laptop("Hp", "EliteBook", 1234));

		System.out.println(list);

		// Sort the list
		Collections.sort(list);

		// Traverse through the list now
		System.out.println("After sorting: " + list);
	}
}