import java.util.*;

class VectorDemo{

	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(20);
		al.add(20);
		al.add(20);
		al.add(20);

		Vector v = new Vector(al); 	// forth constructor : collection
		System.out.println(v);

		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
	
		System.out.println(v);
	}
}

// [20,20,20,20,20]
// [20,20,20,20,20,10,10,10,10,10]
