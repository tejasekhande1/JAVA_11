
// INTERFACE IN CLASS :

class Outer{

	void m1(){
		System.out.println("In Outer M1");	
	}

	interface Inner{
		void m2();
	}

}

class Xyz extends Outer implements Outer.Inner{
	
	public void m2(){
		System.out.println("In Outer M2");
	}
}

class Test{
	public static void main(String[] args){
		Outer out = new Xyz();
		out.m1();                               
	
		Outer.Inner inn = new Xyz();
		inn.m2();

		Xyz obj = new Xyz();
		obj.m1();
		obj.m2();
	}
}
