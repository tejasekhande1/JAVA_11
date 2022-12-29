// Methods Of Vector :

import java.util.*;
class vectorDemo{
	public static void main(String[] args){
		Vector v = new Vector();
		v.addElement("Shashi");
		v.addElement("Ashish");
		v.addElement("Rahul");
		v.addElement("Kanha");
		v.addElement("Badhe");

		System.out.println(v);
		
		System.out.println(v.size());           // actuall elements

		// isEmpty()
		System.out.println(v.isEmpty());        // false

		//elementAt()
		System.out.println(v.elementAt(2));    // Rahul

		// setElementAt()
		v.setElementAt("Rajesh",4);
		System.out.println(v);

		//removeElementAt(index)
		v.removeElementAt(2);            // or direct put element like as "Rahul"
		System.out.println(v);

		//removeRange(i1,i2)		// why this method is protected
		v.removeElement(0,2);         // here 2-1


	}
}
