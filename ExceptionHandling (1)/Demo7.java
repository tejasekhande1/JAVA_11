
// NESTED TRY-CATCH-FINALLY :

class NestedDemo{
	public static void main(String[] args){
		try{
			System.out.println("In Outer Try");
		
			try{
				System.out.println("Inside Inner Try");
				System.out.println(10/0);
			} catch(ArithmeticException obj){
				System.out.println("Inside Inner catch(Try)");
			}

		} catch(Exception obj2){
		
			try{
				System.out.println("Inside Outer Catch");
			} catch(ArithmeticException obj3){
				System.out.println("Inside Inner catch(catch)");
			}

		} finally{
				System.out.println("Inside Finally");
		}
	}
}
