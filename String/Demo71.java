// String : If no change in String
// String Buffer : If many changes in String
// String Builder : Synchronized String

// Difference of Time of Performence between String Buffer and String Builder

import java.util.GregorianCalendar;
class StringBuilderDemo{
	public static void main(String[] args){

		long startTime = new GregorianCalendar().getTimeInMillis();
		long startMemory = Runtime.getRuntime().freeMemory();

		StringBuffer sb = new StringBuffer("Shashi");                        // 36
	//	StringBuilder sb = new StringBuilder("Shashi"); 		     // 19

		for(int i=1 ; i< 1000000 ; i++){
			sb.append("Hello");
		}
	 
		long endTime = new GregorianCalendar().getTimeInMillis();
		long endMemory = Runtime.getRuntime().freeMemory();

		System.out.println("Time = "+ (endTime - startTime));
		System.out.println("Memory = "+ (endMemory - startMemory));
	}
}
