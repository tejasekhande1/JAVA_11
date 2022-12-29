
// VARIABLE IN INTERFACE : VAR CHYA AGODR BY DEFAULT "PUBLIC STATIC" and "FINAL" ADD KARTO(proof in bytecode : javap -c A.class)

interface A {
	int x = 10;
	void m1();
}

interface B {
	int x = 20;
	void m1();
}

class AB implements A,B{
	public void m1(){
		System.out.println(A.x);
		System.out.println(B.x);
	}
}

class Test{
	public static void main(String[] args){
		A obj = new AB();
		obj.m1();
	}
}
