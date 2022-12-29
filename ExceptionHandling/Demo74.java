// MY EXCEPTION :

class MyException extends Exception{

	String msg = null ;

	MyException(String str){        
		msg = str ;
	}

	public String toString(){                
		return msg;
	}
}

class Airport{

	static void checking(int x){
	
		try{
			System.out.println("In Try");		
	        	if ( x > 50)
		 		throw new MyException("Weigth Jara Jast Zala Barka");
		} catch(MyException me){
			System.out.println("In Catch");		
			System.out.println(me.toString());					
		}
	}

	public static void main(String[] args){	
		checking(53);
	}
}
