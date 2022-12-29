
// THROWS : KEYWORD ACCESABLE FOR CONSTRUCTOR,METHODS ; NOT FOR CLASS , Static Block ; can be throws our exceptions
/*
class ThrowsDemo {

	static {                                          // EXECUTE BEFORE CONSTRUCTOR	

	}

	ThrowsDemo() throws ArithmeticException {

	}

	public static void main(String[] args){
		
	}
} */

class MyException extends Exception{

}

class ThrowsDemo{
	public static void main(String[] args) throws MyException{

	}
}
