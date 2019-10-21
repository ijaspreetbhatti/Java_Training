 // Sorting 
import java.util.ArrayList;
import java.util.Collections;
 class SortingStarter{
 	public static void main(String[] args) {
 		ArrayList list = new ArrayList();

 		list.add(867);
 		list.add(8670);
 		list.add(122);
 		list.add(-99);
 		list.add(2001);
 		list.add(22);

 		System.out.println("Contents of List : " + list);

 		//Sort the list

 		Collections.sort(list);

 		System.out.println("After sorting, Contents of List : " + list);

 	}
 }