// 3) ListIterator : 
import java.util.*;
class ListIteratorCursor{
	public static void main(String[] args){
		Vector v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);

// 		System.out.println(v);
	
		ListIterator e = v.listIterator();                      // ListIterator cursor apllied

		while(e.hasNext()){
			Integer I = (Integer)e.next();
			if( I == 30)
				e.set(60);
		}

		while(e.hasNext()){
			System.out.println(e.next());
		}

		while(e.hasPrevious()){
			System.out.println(e.previous());
		}
	}
}
