// MAP(I) : Daigram : 7:00 
// MAP : KEY VALUE PAIRS ARE CONSISTS : KEY --> UNIQUE ; KEY AMAZON AND VALUE JEFF BEZOS
// 	 KEY CANNOT BE DUPLICATE ACCESS BUT VALUE CAN BE ACCESS DUPLICATES
// 	 ENTRY IS INNER INTERFACE OF MAP ----> (MAP$ENTERY) ---> javap java.util.Map and javap java.util.Map.Entry
// 	 INTERNALLY USED HASHTABLE DATA STRUCTURE IN HASHMAP AND IT DEPENDS ON KEY
// 	 HASHMAP HAS FOUR CONSTRUCTOR : 
// 	 1) HashMap h = new HashMap(); ---> ByDefault 16 size and Filling Ratio is 75%
// 	 2) HashMap h = new HashMap(int initialCapacity); -----> Fill Ratio is 75%
// 	 3) HashMap h = new HashMap(int initialCapacity,Float FillRatio); -----> Fill Ratio depends on Us
// 	 4) HashMap h = new HashMap(HashMap obj); -----> For Mixed Two HashMap
// REAL TIME EXAMPLE : AMAAZON - JEFF BEZOS ; MICROSOFT : BILL GATES ; SPACEX : ELON MUSK ; FACEBOOK : MARK ZUKARBURG

import java.util.*;
class Employee{
	public static void main(String[] args){
		Map<Integer,String> m = new HashMap<Integer,String>();     // for removing compile time note
		m.put(108,"Ashish");
		m.put(128,"Kanha");
		m.put(78,"Rahul");		// remove automaticaaly when key is duplicate
		m.put(152,"Kanha");		
		m.put(78,"Bade");		

		System.out.println(m);
	}
}

// In dupilcate key case compiler remove previous entry and printout last key and their value
