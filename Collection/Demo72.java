// LinkedHashSet : Like As HashSet ; InterNally Used Diubly LinkedList

import java.util.*;

class LinkedHashSetDemo{
	public static void main(String[] args){
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("Apple");
		lh.add("Amazon");
		lh.add("NVDIA");
		lh.add("Microsoft");
	
		System.out.println(lh);                       // sequentially print
	}
}
