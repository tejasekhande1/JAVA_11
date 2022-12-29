/* TO SEE PARENT CLASS OF ARITHMETIC EXCEPTION : javap java.lang.ArithmeticException => see extends Line
 * RunTime Exception(only constructors) => Exception(only constructor) => Throwable(constructors and methods) => Object */

// EXCEPTION FLOW DAIGRAM 38:00 :

// TRY & CATCH :

class Demo{

	void fun(){
		System.out.println("In Fun");
	}

	public static void main(String[] args){
		System.out.println("Before Exception Ocuures");
	
		Demo obj = null ;
	
		try{
			obj.fun();
			
		}catch(NullPointerException npe){                     // Exception : if we dont know exception
			System.out.println("In Catch");
		}
	
		System.out.println("After Exception Ocuures");
	}
}
