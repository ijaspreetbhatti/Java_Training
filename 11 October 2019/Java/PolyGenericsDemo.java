import java.util.Set;
import java.util.HashSet;
class PolyGenericsDemo{
	public static void main(String[] args) {


		// List<Human> list = new ArrayList<>();

		// list.add(new Akhil()); //Always works
		// list.add(new Sneha()); //Always works
		

		// HashMap<String, Integer> map = new HashMap<>();


		// Set<String> set = new HashSet<>();

		// set.add("ABC");
		// set.add("TCS");

		// new PolyGenericsDemo().other(set);

		Set<Human> setHuman = new HashSet<>();

		new PolyGenericsDemo().changesToSet(setHuman);

	}

// Accepts any set with type Object or a sublass of Object but we cannot add to this set
	void other(Set<? extends Object> set){
		 // String str = (String)set.get(0);

		 // set.add("hello"); // Fails, cannot even add a String to this set

	}


	void changesToSet(Set<? super String> set){
		 // String str = (String)set.get(0);

		   set.add(new Human()); 
		   set.add(new Sneha()); 
		  // set.add(new Company());

	}


	List<? extends Object> list;
	


	List<Object> list;
	List<?> list;









}