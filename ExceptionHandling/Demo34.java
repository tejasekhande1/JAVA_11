
class Demo{
	public static void main(String[] args){
		System.out.println("Core2web");

		try{
			System.out.println(10/0);

		} catch(ArithmeticException obj){
			
			System.out.println("Divider is Zero");
		}

		System.out.println("Biencaps");
	}
}
