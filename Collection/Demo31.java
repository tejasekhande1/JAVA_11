// 2) Iterator : 
import java.util.*;
class IteratorCursor{
	public static void main(String[] args){
		Vector v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);

// 		System.out.println(v);
	
		Iterator e = v.iterator();                      // enum cursor apllied

		while(e.hasNext()){
			Integer val = (Integer)e.next();
			if( val % 4 == 0)
				e.remove();
		}

		System.out.println(v);
	}

}

// [10,20,50]
