
class Core2web extends RuntimeException{                          // or Excsption 

	int x = 20 ;
}

class Demo{
	public static void main(String[] args){
		System.out.println("Before Exception");
		
		try{
			System.out.println(10/0);
		} catch(Core2web obj){
			System.out.println("Handling Mode");	                       // MUST BE HANDLING CODE THERE EITHER ERROR OCCURS
		}

		System.out.println("After Exception");
	}
}

// ERROR IN RUNTIME
