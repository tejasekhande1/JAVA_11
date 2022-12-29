
import java.util.*;

class Numbers{
	public static void main(String[] args){
		SortedSet  s = new TreeSet();

		s.add(10);
	//	s.add(new Integer(10));          ---> another method
		s.add(35);
		s.add(8);
		s.add(32);

		System.out.println(s);
	}
}

// [8,10,32,35]
// Sorting chya goshti StringBuffer class var chalat nahii ----> nahitar ClassCast exceptiion det
