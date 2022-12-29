//LINKED LIST : DUPLICATE DATA CAN BE ACCESS ; DYNAMICALLY MEMORY ALLOCATION AND INCREASES SIZE WITH ADDING ELEMENTS ; ALLOW INDEXING
// DIFF BETN ARRAY LIST AND LINKED LIST

import java.util.*;
class LinkedListDemo{

	String prodName = null;
	float price = 0.0f;

	LinkedListDemo(String prodName , float price){
		this.prodName = prodName;
		this.price = price;
	}

	void disp(){
		System.out.println("Product Name : " +prodName);
		System.out.println("Prize : " +price);
	}
}

class LinkedListConst{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.add(new LinkedListDemo("Gahoo",40.50f));
		ll.add(new LinkedListDemo("Tandul",43.50f));
		ll.add(new LinkedListDemo("Bajari",48.50f));

		System.out.println(ll);

		Iterator itr = ll.iterator();
		while(itr.hasNext()){
			LinkedListDemo obj = (LinkedListDemo)itr.next();
			obj.disp();
		}
	}
}
