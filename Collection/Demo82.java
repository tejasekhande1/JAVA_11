// METHODS OF SORTEDSET :

import java.util.*;

class LangData{
	public static void main(String[]args){
		SortedSet s = new TreeSet();
		s.add("Cpp");
		s.add("C");
		s.add("Java");
		s.add("Python");
		s.add("React");
		s.add("Android");

		System.out.println(s);

		// FIRST()
		System.out.println(s.first());  // Android

		// LAST()
	
		// headSet(Object)
		System.out.println(s.headSet("Cpp"));    // CPP chya agodrchya values print hotat

		// tailSet(Object)
		System.out.println(s.tailSet("Cpp"));    // CPP ani tyachya nantarcya values print hotat

		// subSet(start,end)
		System.out.println(s.subSet("C","React")); // C C++ Java Python
	}
}

// OUTPUT SORTED BASED ON ALPHABETICAL ORDER
