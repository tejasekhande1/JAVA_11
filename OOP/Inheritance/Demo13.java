// MULTIPLE INHERITANCE : Daigram 44 : 00

class A{
	void m1(){
		System.out.println("Class A - m1");
	}
}

class B{
	void m1(){
		System.out.println("Class B - m1");
	}
}

class C extends A,B{
	public static void main(String[] args){
		
	}
}
