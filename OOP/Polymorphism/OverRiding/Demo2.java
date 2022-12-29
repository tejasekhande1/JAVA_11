
// FINAL METHOD : FINAL METHOD CANNOT BE OVERRIDE
// STATIC METHOD : STATIC METHOD CANNOT BE OVERRIDE IN CHILD CLASS ; WE CANNOT OVERRIDE NORMAL METHOD IN PARENT CLASS TO STATIC METHOD IN CHILD
// 		   WE CAN ACCESS BOTH STATIC METHODS IN PARENT AND CHILD BUT CALL DEPENDS ON REFERENCE

class Parent{
	final void m1(){
		System.out.println("In m1 - Parent");
	}

	static void m2(){
		System.out.println("In m2 - Parent");
	}
}

class Child extends Parent{

/*	void m1(){
		System.out.println("In m1 - Child");
	}        	*/

	void m2(){
		System.out.println("In m2 - Child");
	}

	public static void main(String[] args){
		
		Child obj = new Child();
		obj.m1();
		m2();
	}
}
