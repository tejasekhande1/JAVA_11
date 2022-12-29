// METHODS OF MAP :

import java.util.*;
class MapMethods{
	public static void main(String[]args){
		Map<String,String> m = new HashMap<String,String>();
		m.put("Amazon","JeffBezos");
		m.put("Microsoft","BillGates");
		m.put("FaceBook","MarkZukerburge");
		m.put("Apple","SteveJobs");
		m.put("SpaceX","ElonMusk");

		System.out.println(m);

		// get(key)
		System.out.println(m.get("SpaceX")); // give value of SpaceX key
		System.out.println(m.get("Spacex"));  // NULL ----> Key Unavailable

		//remove(key)
		m.remove("Apple");
		System.out.println(m.remove("SpaceX"));  // Return Valueos of that key 

		// containsKey(Key)
		System.out.println(m.containsKey("SpaceX"));  // True

		// containsValue(Value)
		System.out.println(m.containsValue("ElonMusk"));  // True

		// isEmpty()
		System.out.println(m.isEmpty());  // false

		// size()
		System.out.println(m.size());  // 3

		// keySet() ----> Print All Key
		// valueSet() ----> Print All Values
		// entrySet() -----> Return Set By Set

		System.out.println(m.entrySet());

	}
}
