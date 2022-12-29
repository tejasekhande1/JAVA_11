
// COMPILE TIME EXCEPTION : IO Exception ;
// RUN TIME EXCEPTION : Arithmatic Exception ; Null Pointer Exception ;
// EXCEPTION : SOME PROBLEM OCCURES IN FLOW OF OUR CODE ; 
// REAL TIME EXAMPLE : HOME TO OFFICE (ACCIDENT IS EXCEPTION)
// EXCEPTION HANDLING : SOLUTION FOR EXCEPTION IN CODE TO NORMAL TERMINATION ; DEFAULT EXCEPTION HANDLER ASTO 

class ExceptionDemo {
	public static void main(String[] args){
		ExceptionDemo obj = new ExceptionDemo();        // ExceptionDemo obj = null ;  ------> RunTime Exception
		System.out.println("In Main");
		obj.fun();
		System.out.println("In Main - Affter Fun");
	}

	void fun(){
		System.out.println("In Fun");
		gun();
	}
	
	static void gun(){
		System.out.println("In Gun");
		System.out.println(10/0);		// Arithmatic [Run-Time Exception]
	}
}

/* SOP(10/0) ----> java.lang.ArithmaticException ;
 * obj = null ; obj.fun() -----> java.lang.NullPointerException
 *
 * 1. Thread Name (in which exception occures)
 * 2. Exception Name (Exception class Name)              ---> class java.lnag.ArithmaticException
 * 3. Description (optional)				----> 
 * 4. Stack Trace (in which fun exception occures)
 * DAIGRAM 56:12
 */
