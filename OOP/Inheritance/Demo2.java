/* INHERITANCE : class x { }  ----------> Parent Class Object Asto ; extends kela tar object class parent mhnun yet nahi ; ekhadya class la jar parent                                            class nasel tar object class indirect parent class banato

class A extends A {    			// CYCLIC INHERITANCE         NO ACCESS IN JAVA

}

Super() : Used For Initialized instance variables of Parent class  ; Apan class madhe first line la super() add kela tari chalto ;
       	  Method madhe super() chalat nahi...fkt constructor madhe chalto
*/

class Parent{

	int x = 10;      // Child cha obj use karun jar hya x print karaycha asel tr SOP(super.x) ; method pan call karu shakto super.m1()

/*	void m1(){
		System.out.println("In Parent Class");
	}
	*/
}

class Child extends Parent{

	int x = 20 ;                                           // Object Nusar Call Hoto

	void m1(){
		System.out.println("In Child Class");
	}

	public static void main(String[]args){
/*		Child c = new Child();		             // Call Child Class Method
		c.m1();
	
		Parent c = new Child();                      // Call Child Class Method
		c.m1();                       */
	
		Parent c = new Child();             // Error when m1() not in Parent Class
		c.m1();
	}
}
