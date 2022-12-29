// Stack : real time example and interview question (LIFO)
// 	   eka room madhe jo shevti manus gela to pahila baher ala tar te data structure konta ahee ----> STACK

import java.util.*;

class StackDemo{
	public static void main(String[] args){
		Stack s = new Stack();
		s.add("Amazon");
		s.addElement("Microsoft");
		s.push("Tesla");

		System.out.println(s);            // Amazon,Microsoft,Tesla

		s.pop();
		System.out.println(s);            // Amazon,Microsoft

		System.out.println(s.peek());    // print top element (Microsoft)

		System.out.println(s.search("Microsoft"));  // 1
		System.out.println(s.search("Amazon"));  // 2
	}
}

// Daigram : 52:11
