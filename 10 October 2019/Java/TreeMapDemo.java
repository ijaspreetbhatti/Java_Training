import java.util.TreeMap;
import java.util.Set;
// import java.util.Map.Entry;
class TreeMapDemo{
	public static void main(String[] args) {
		TreeMap map = new TreeMap();

		map.put("Ravish", 1000.0);
		map.put("Meenakshi", 1100.0);
		map.put("Anupam", 566.99);

		//System.out.println(map);

		//Traverse through the map

		//Get a set of the entries
		Set set = map.entrySet();

		for(Object ob: set){
		 java.util.Map.Entry entry = (java.util.Map.Entry) ob;
			System.out.print("Key: " + entry.getKey());
			System.out.println("Value: " + entry.getValue());

		}

		Double currentBalance = (Double) map.get("Meenakshi");
		map.put("Meenakshi", currentBalance + 1200.0);

		System.out.println("Meenakshi's updated balance: " + map.get("Meenakshi"));


	}
}