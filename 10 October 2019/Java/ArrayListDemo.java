import java.util.ArrayList;
import java.util.Iterator;
class ArrayListDemo{
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();

		list.add(2);
		list.add(76.88);

		System.out.println("Size of list: " + list.size());

		list.add('r');
		list.add("IBM");

		list.add(new ArrayListDemo());

		System.out.println("Now, Size of list: " + list.size());

		// Iterator it = list.iterator();

		// System.out.println("The elements in the collection currently are: ");
		// while(it.hasNext()){
		// 	System.out.println(it.next());
		// }

		//OR

		for(Object ob : list){
			System.out.println(ob);
		}


		//Remove an element at index:2
		// list.remove(2);

		//Remove an element by value
		list.remove(new Integer(2));

		 System.out.println("After deleting one object, The elements in the collection currently are: ");

		for(Object ob : list){
			System.out.println(ob);
		}


	}
}