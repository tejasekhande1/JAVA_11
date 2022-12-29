
// NESTED INTERFACE : IN CLASS , INTERFACE IS ACCESABLE

interface Outer{

	void m1();

	interface Inner{
		void m2();
	}

}

class Xyz implements Outer,Outer.Inner{

	public void m1(){
		System.out.println("In Outer M1");
	}
	
	public void m2(){
		System.out.println("In Outer M2");
	}
}

class Test{
	public static void main(String[] args){
		Outer out = new Xyz();
		out.m1();
//		out.m2();                                -----> ERROR
	
		Outer.Inner inn = new Xyz();
//		inn.m1();				 -----> ERROR
		inn.m2();

		Xyz obj = new Xyz();
		obj.m1();
		obj.m2();
	}
}
