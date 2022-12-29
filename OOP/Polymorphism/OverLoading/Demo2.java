class Demo{

	void m1(int x , float y){
		System.out.println("Int-Float");
	}
	
	void m1(float y , int x){
		System.out.println("Int-Float");
	}

	public static void main(String[] args){
		Demo obj = new Demo();
		obj.m1(10,10);
	}
}

// AMBIGIOUS BEHAVIOUR
