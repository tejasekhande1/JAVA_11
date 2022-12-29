// WeakHashMap : Je Objects Null Zale Ahet Te Saglya Entries GarbageCollector Clear Karto ; HashMap madhe he hot nahii
//		hashmap madhe garbage collector anala tari to entries clear karu shakat nahii
import java.util.*;

class WeakHashMapDemo{
	public static void main(String[] args){

		WeakHashMap<String,Integer> h = new WeakHashMap<String,Integer>();
		String s1 = new String("PV Sindhu");
		String s2 = new String("Sushil Kumar");
		h.put(s1,2);
		h.put(s2,3);

		System.out.println(h);

		s1 = null ;
		System.gc();

		System.out.println(h);
	}
}
