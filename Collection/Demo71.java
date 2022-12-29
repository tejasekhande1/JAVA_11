import java.util.*;

class HashSetDemo{
	public static void main(String[] args){
		HashSet h = new HashSet();
		
		h.add("Virat Kohali");
		h.add("MSD");
		h.add("Rohit Sharma");
		h.add("Rishabh Pant");
		h.add("Hardik Pandya");

		Iterator itr = h.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		// contains()
		System.out.println(h.contains("Shreyas Iyer"));       // element ahe ka nahi te bghto -----> False

		// size()
		System.out.println(h.size());       // 5
	
		// remove()
		h.remove("Rishabh Pant");
		System.out.println(h); 

		h.clear();	
		System.out.println(h); 
	}
}
