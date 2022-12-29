
class Demo{

	void m1(Object s1){
		System.out.println("Object Method");
	}

	void m1(String s2){
		System.out.println("String Method");
	}

	public static void main(String[] args){
		
		Demo obj = new Demo();
		obj.m1(null);              // ----> In This case Prefer demand for child class
	}
}
