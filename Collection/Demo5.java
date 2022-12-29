
// default capacity of arraylist is 10

import java.util.*;
class ArrayListConstr{
	public static void main(String[] args){
		
		ArrayList al1 = new ArrayList(500);
	
//		System.out.println(al1.capacity());               --> capacity() method not in array list
		System.out.println(al1.size());                   // 0

		al1.add(10);
		al1.add(10);
		al1.add(10);
		al1.add(10);
		al1.add(10);
		
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList(al1);
		al2.add(20);		
		al2.add(20);		
	
		System.out.println(al2);

		System.out.println(al1.size());                   // 5
	}
}
