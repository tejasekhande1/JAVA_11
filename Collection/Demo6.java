// VECTOR : 

import java.util.*;
class VectorDemo{
	public static void main(String[] args){
		Vector v = new Vector(); 
		System.out.println(v.capacity());                            // by default 10
		v.addElement(10);		
		v.addElement(20);		
		v.addElement(30);		
		v.addElement(40);		
		v.addElement(50);		
		System.out.println(v.capacity());    		//10

		// Cursor
		System.out.println();
		System.out.println("Vector Elements Are : ");

		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
}

// jo paraynt 10 capacity full nahi hot to paryant size increase nahi honar
