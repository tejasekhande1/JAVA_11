
// throw : used for customization exception ; bcoz in predefine exceptions when exception occurs they throws exception by default

/*
class ThrowDemo{

	public static void main(String[] args){

		throw new ArithmeticException("Divide by Zero");
	}
}
 */
/*
class ThrowDemo{

	static ArithmeticException ae = new ArithmeticException("Divide By Zero");

	public static void main(String[] args){

		throw ae ;
	}
} */

// Error : Exception in thread "main" java.lang.ArithmeticException: Divide by Zero
//	at ThrowDemo.main(Demo72.java:7)

class ThrowDemo{

	static IOException io = new IOException("Aplach Exception");

	public static void main(String[] args){

		try{
		 	throw io ;
		} catch(IOException obj){
			System.out.println(obj);
		}
	}
}
