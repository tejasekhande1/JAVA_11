// Dictionary (Abstract Class) : Obsolet(Not refer for Used it) ; In V. 1.0 ; Legacy Class ; OutDated 
// Support to key value pair

import java.util.*;

class SpaceRide{
	public static void main(String[] args){
		Dictionary d = new Hashtable();
		d.put("Virgin Galentic","Richard Branson");
		d.put("Blue Origin","Jeff Bezos");
		d.put("SpaceX","Elon Musk");

		System.out.println(d);

		// size()
		System.out.println(d.size());

		// isEmpty()
		System.out.println(d.isEmpty());
	
		System.out.println(d.get("Blue Origin"));       // Jeff Bezos
		System.out.println(d.get("Blue"));             // NULL
	
		System.out.println(d.remove("SpaceX"));
	
		// elements
		Enumeration itr = d.elements();
		while(itr.hasMoreElements()){
			System.out.println(itr.nextElement());
		}
	
		// keys
		Enumeration itr1 = d.keys();
		while(itr1.hasMoreElements()){
			System.out.println(itr1.nextElement());
		}
	}
}
