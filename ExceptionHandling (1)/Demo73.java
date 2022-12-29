// USER EXCEPTION :

class MyException extends Exception{

	String msg = null ;

	MyException(String str){                          // mhnun constructor dila ithe
		msg = str ;
	}

	public String toString(){                  // object class method we override
		return msg;
	}
}

class CustomizedException{
	public static void main(String[] args){
		try{			
			System.out.println("In Try");
			throw new MyException("Customized Exception");              // calls para. constructor
	
		} catch(MyException me){
			System.out.println("In Catch");		
			System.out.println(me.toString());		
		}
	}
}
