
class Demo{

	void product(){
		System.out.println("My Product : Bielearn");
	}

	public static void main(String [] args){

		System.out.println("Statement 1");
		try{
			System.out.println("Statement 2");
			System.out.println(10/0);
			System.out.println("Statement 3");

		} catch(ArithmeticException e){
			System.out.println("Statement 4");
		}

		System.out.println("Statement 5");
		
		try{
			System.out.println("Statement 6");
			Demo obj = null ;
			obj.product();
			System.out.println("Statement 7");

		} catch(NullPointerException e1){
			System.out.println("Statement 8");
		}

		System.out.println("Statement 9");
	}
}
