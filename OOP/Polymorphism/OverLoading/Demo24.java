
class Demo{

	void m1 (int x){
		System.out.println("Int-Method");
	}

	void m1 (int x , int y){
		System.out.println("Two-Int-Method");
	}

	void m1 (int ... varg){                                        // ZERO OR MANY VARIABLES ; LESS PRIORITY 
		System.out.println("VarArgs-Method");
	}
}

class Test{

	public static void main(String[] args){
	
		Demo obj = new Demo();
		obj.m1();                                 // Var-Args-Method
		obj.m1(10);				  // Int-Method
		obj.m1(10,20);				// Two-Int-Method
		obj.m1(10,20,30);			// Var-Args-Method
	}
}
