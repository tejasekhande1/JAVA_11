import java.util.*;

class ArrayListMethods{
	public static void main(String[] args){
		ArrayList al = new ArrayList();

		al.add("Amazon");
		al.add("Microsoft");
		al.add("Apple");
		al.add("Flipcart");
		al.add("Amazon");

		System.out.println(al);

		//add(index,object))
		al.add(2,"Oracle");
		System.out.println(al);

		//indexof(object)
		System.out.println(al.indexOf("Amazon"));
		System.out.println(al.indexOf("BirlaSoft"));         // -1
	
		//lastIndexof(object)
		System.out.println(al.lastIndexOf("Amazon"));

		//remove(int)
		al.remove(3);
		System.out.println(al);

		//size()
		System.out.println(al.size());

		//remove(object)
		al.remove("Amazon");
		System.out.println(al);

		//clone()                                             // copy arraylist
		ArrayList al2 = (ArrayList)al.clone();
		System.out.println(al2);

		//clear
		al.clear();
		System.out.println(al);
		System.out.println(al2);

	}
}
