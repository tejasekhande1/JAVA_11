
// TRY WITH MULTIPLE CATCH BLOCK :

class MultiCatch{
	public static void main(String[] args){

		try {
			System.out.println(10/2);	
		} catch(ArithmeticException obj1){                          // OR (EXCEPTION OBJ ) ----> BCOZ IT IS PARENT CLASS 
			System.out.println("Arithmetic Exception 1");
		} catch(ArithmeticException obj2){
			System.out.println("Arithmetic Exception 2");
		}
	}
}

// ERROR : ARITHMETIC EXCEPTION ALREADY CAUGTH
// IN MULTIPLE CATCH BLOCKS WE SHOULD FOLLOW SEQUENCED ; (ARITHMETICEXCEPTIO OBJ) => (EXCEPTION OBJ2) ---> ACCESSABLE IN ABOVE CODE
