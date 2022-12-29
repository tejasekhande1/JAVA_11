// HASHTABLE : Used hashFunction/hashCode() on key values ; Internally some calcilation and output is index of hashTable
// key % 11(capacity) = ans(index) ---> Remainder
// IF REMAINDER IS SAME THEN TWO VALUES CAN BE STORE AT ONE BOX/INDEX
// Output : Top To Bottom and Right to Lefti
// DEFAULT CAPACITY : 11 LOAD FACTOR : 0.75
// IMP in Interview : HashMap,HashTable,Map
// DAIGRAM : 30:00
// HOW TO CREATE CUSTOMIZED HASHTABLE ?

import java.util.*;

class Friends{
	public static void main(String[] args){

	//	Hashtable h = new Hashtable();
	
		Hashtable h = new Hashtable(15);      // key % 15 = remainder
	
		h.put(24,"Kanha");
		h.put(54,"Rahul");
		h.put(15,"Shashi");
		h.put(52,"Ashish");
		h.put(9,"Badhe");
		h.put(12,"Rajesh");
		h.put(11,"Sachin");
		h.put(30,"Akshay");

		System.out.println(h);
	}
}

// HASHMAP vs HASHTABLE :
// HASHMAP : AT A TIME INSERT MULTIPLE VALUES ; FASTER ; PARENT CLASS ABSTRACTMAP
// HASHTABLE : AT A TIME INSERT SINGLE VALUE ; SLOWER ; PARENT CLASS DICTIONARY
