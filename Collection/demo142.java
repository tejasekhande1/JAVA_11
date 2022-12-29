//SortedMap(I) : Child InterFace of Map(I) ; 
//		It used for sorting elements in naturally order ; Map Cannot be Sorted Automatically 
//		javap java.util.SortedMap

import java.util.*;
class SortedMapDemo{
	public static void main(String[] args){
		SortedMap<String,String> s = new TreeMap<String,String>();

		s.put("C++",".cpp");		
		s.put("C",".c");		
		s.put("Python",".py");		
		s.put("Java",".java");

		System.out.println(s);		

		// firstKey()
		System.out.println(s.firstKey());
	
		// lastKey()
		System.out.println(s.lastKey());

		// keySet() ----> display set of keys
		System.out.println(s.keySet());
		
		// values() ----> display set of values
		System.out.println(s.values());

		// entrySet() -----> Entries
		System.out.println(s.entrySet());

		// headMap() ----> Key Chya Agodarchya goshti print Karto but key nahi karat
		System.out.println(s.headMap("Java"));

		// tailMap() ----> Key ani tya nantrchya goshti print Karto
		System.out.println(s.tailMap("Java"));

		// subMap() ----> between two entries and includes starting entries
		System.out.println(s.subMap("C","Java"));
	}
}
