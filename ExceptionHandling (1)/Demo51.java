// DEFAULT EXCEPTION HANDLER CALLS THREE METHODS :
// A] PRINTSTACKTRACE
// B] FIELDSTACKTRACE
// C] GETMESSAGE

class PrintException{
	public static void main(String[] args){
	
		try{
			System.out.println(10/0);
		} catch(ArithmeticException obj){
			obj.printStackTrace();
			System.out.println(obj.toString());
			System.out.println(obj.getMessage());
		}
	}
}

// JEVDHYA THREAD TEVDHYA STACK
// TRY MADHE EXCEPTION ALYAVR TO DIRECT CATCH MADHE JATO....EXCEPTION JYA LINE VAR YEIL TYA LINE CHYA KHALCHYA LINES EXECUTE HOT NAHIIII
