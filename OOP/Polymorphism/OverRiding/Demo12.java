
// Overriding mdhe scope kami karaycha nahi : PUBLIC <----- PROTECTED <----- DEFAULT <------- PRIVATE

class Parent{

	void property(){
		System.out.println("Property");
	}

	void career(){                                        
		System.out.println("Doctor");
	}
}

class Child extends Parent{
	protected void career(){                                                 
		System.out.println("Engineer");
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
