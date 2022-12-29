// METHODS OF MAP :

import java.util.*;
class UsCompany{
	public static void main(String[]args){

		Map<String,String> m = new HashMap<String,String>();
		m.put("Amazon","JeffBezos");
		m.put("Microsoft","BillGates");
		m.put("FaceBook","MarkZukerburge");
		m.put("Apple","SteveJobs");
		m.put("SpaceX","ElonMusk");

		System.out.println(m);

		Set<Map.Entry<String,String>> entry = m.entrySet();    // Map$Entry
		
		Iterator <Map.Entry<String,String>> itr = entry.iterator();
		while(itr.hasNext()){
			Map.Entry<String,String> actualEntry = itr.next();
		
/*			if(actualEntry.getKey().equals("Apple")){
				actualEntry.setValue("Tim Cook");
			}
*/		
			System.out.println(actualEntry.getKey());
		}
	}
}

// getKey() and getValue() methods of map and here we can access through set using iterator
