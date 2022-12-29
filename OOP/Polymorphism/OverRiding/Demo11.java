
class Parent{

	void property(){
		System.out.println("Property");
	}

	Number career(){                                             // OVERWRIDDEN
		System.out.println("Doctor");
		return null ;
	}
}

class Child extends Parent{
	Integer career(){                                           // OVERRIDER           
		System.out.println("Engineer");
		return null ;
	}
}

class Demo{
	public static void main(String[] args){
	
		Parent p = new Parent();
		p.career();
		Child c = new Child();
		c.career();
		Parent p1 = new Child(); 
		p1.career();

	}
}
