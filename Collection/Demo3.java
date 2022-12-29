// 1) ENUMERATION (1.0 VERSION) : TWO METHODS -> hasMoreElement() ; nextElement()
// 		Used only on Legasy classes i.e vector and stack
// 		javap java.util.Enumeration
// 		In 1.9 version,asIterator() add keliye : because in 1.1 madhe fkt vector and stack ch use karta yet hot mhnun
//		daigram 21:00

import java.util.*;
class EnumCursor{
	public static void main(String[] args){
		Vector v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);

// 		System.out.println(v);
	
		Enumeration e = v.elements();                      // enum cursor apllied

		while(e.hasMoreElements()){
			Integer val = (Integer)e.nextElement();
			if( val % 4 == 0)
				System.out.println(val);
		}
	}
}

// 20
// 40
