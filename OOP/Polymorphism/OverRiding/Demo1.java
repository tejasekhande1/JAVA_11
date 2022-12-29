
// OVERRIDING : TWO DIFFERENCE CLASSES (INHERITED) ; BOTH PARENT & CHILD CLASS METHODS RETURN TYPE MUST BE SAME ; 

class Parent{

	void property(){
		System.out.println("Property");
	}

	void career(){                                              // OBJECT CAREER()
		System.out.println("Doctor");
	}
}

class Child extends Parent{
	void career(){                                             // STRING CAREER() / OBJECT CAREER()
		System.out.println("Engineer");
	}
}

class Demo{
	public static void main(String[] args){
	
		Parent p = new Parent();
		p.career();
		Child c = new Child();
		c.career();
		Parent p1 = new Child();  // In Overriding Object calls their method not call reference method
		p1.career();

	}
}

// RAPPER CLASSES : INT,FLOAT,DOUBLE ----> PARENT CLASS NUMBER ; THIS IS ACCESABLE IN OVERRIDING
