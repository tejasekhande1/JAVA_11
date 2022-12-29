
import java.util.*;
class LinkedListMethods{
	public static void main(String[] args){
		LinkedList l1 = new LinkedList();
		l1.add("c");
		l1.add("cpp");
		l1.add("java");
		l1.add("python");
		l1.add("c");

		System.out.println(l1);

		// add(index,object)
		l1.add(3,"Networking");
		System.out.println(l1);

		// addFirst()
		l1.addFirst("React");
		System.out.println(l1);
	
		// addLast()
		l1.addLast("Js-Node");
		System.out.println(l1);

		// removeFirst()
		l1.removeFirst();
		System.out.println(l1);
	
		//set(index,object)              // value replace karato
		l1.set(5,"PHP");
		System.out.println(l1);

		// indexof(object) ; lastIndexOf() ; getFirst() ; getLast();
	}
}
