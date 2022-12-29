// SORTEDSET(I) : Comparison Between Similar Data [int compareTo(object)]: Sort : Avoid Duplicate Data

import java.util.*;

class sortedSetDemo{
	public static void main(String[] args){
		SortedSet s = new TreeSet();
		s.add("BMW");
		s.add("Audi");
		s.add("Mercedes");
		s.add("Hundaii");
		s.add("MG");

		System.out.println(s);
	}
}

// [Audii,BMW,Hundaii,MG,Mercedes]
// arranged in Alphabetical order depends on Ascii values
