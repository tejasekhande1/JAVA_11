// CURSOR : FOUR TYPES
// 1] ENUMERATION 		(1.0 VERSION : VECTOR AND STACK)
// 2] ITERATOR 			(1.2 VERSION : UNIVERSAL CURSOR)
// 3] LIST ITERATOR		(1.2 VERSION : ONLY FOR LIST INTERFACE AND THEIR 4 CLASSES)
// 4] SPLITERATOR		(1.8 VERSION : MULTIPROGRAMING/MULTIPROCESSING)	

import java.util.*;
class CursorDemo{
	public static void main(String[] args){

		Vector v = new Vector();
	
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
	
		System.out.println(v);
	}
}
