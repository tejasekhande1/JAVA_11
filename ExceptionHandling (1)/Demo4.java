
// ONLY CHECKED/COMPILE TIME EXCEPTION CAN BE THROWS

class ThrowsDemo{
	public static void main(String[] args) throws NullPointerException{  // no matter which exception here....no consider runtime exception
	
		System.out.println("Hello");
		System.out.println(10/0);                 // OUTPUT GIVES ARITHMETIC EXCEPTION 

	}
}
