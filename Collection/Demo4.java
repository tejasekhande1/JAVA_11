// In Collection interface includes common methods in List(),Set() and Queue()  i.e size() ; isEmpty() ; iterator() -> Universal Cursor ; etc etc
// 1] LIST():
// a] ARRAYLIST() : Duplicate data can be accesable

import java.util.*;

class ArrayListDemo{
	public static void main(String[] args){
		ArrayList al = new ArrayList();

		al.add("shahsi");		
		al.add("ashish");		
		al.add("kanha");		
		al.add("rahul");		
		al.add("badhe");	
		al.add("ashish");		

		System.out.println(al);	

		ArrayList al2 = new ArrayList();
		al2.add("Madhur");
		al2.addAll(al);
		System.out.println(al2);	
	}
}
