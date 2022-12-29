// DUPLICATE DATA THEVAYCHA ASEL TR LIST USE KARAVA
// SET : NOT ACCESS DUPLICATE DATA : NO INDEXING : INSERTION ORDER NOT PRESERVE : OUTPUT NOT SEQUENTIALLY
// 1) HASHSET --> HASHSET INTERNALLY IS HASHMAP because hashmap don value gheto() ; and understand through source code
// 		  HASHSET CHA CONSTRUCTOR ANI METHOD INTERNALLY HASHMAP LACH CALL KARTO
// 		  HASHSET DEFAULT SIZE IS 16 LIKE AS HASHMAP AND FILL RATIO ALSO SAME 75%
// 		  SOURCE CODE FOR HASHSET FOR PROOF

// CONSTRUCTORS OF HASHSET : 
// 1) HashSet s = new HashSet();  ----> Auto size 16 and Fill Ratio is 75% i.e. 12
// 2) HashSet s = new HashSet(int initialCapacity)
// 3) HashSet s = new HashSet(int initialCapacity,float fillration) ---> fill ratio paryant size ali tr to size vadhavtoy
// 4) HashSet s = new HashSet(collection)

// LinkedHashSet ---> Tottaly Similar as HashSet : IT preserve Insertion Order And OutPut also in Sequence

import java.util.*;
class HashSetDemo{
	public static void main(String[] args){
		Set s = new HashSet();
		s.add("Ashish");
		s.add("Kanha");
		s.add("Badhe");
		s.add("Rahul");
		s.add("Kanha");

		System.out.println(s.add("Ashish"));   // false because already exists
		System.out.println(s.add("Shashi"));   // true
		System.out.println(s.add("Kanha"));    // false
	
		System.out.println(s);
	}
}

// Interview Quiz : Jar Duplicate data thevaycha asel ttr konta data structure use karshil -----> List madhla konta pn
// 			0hk...mg tyatil duplicate data remove karayla kay karshil ----> Hashset la te ds pass karen
// 			Set s = new HashSet(v);
