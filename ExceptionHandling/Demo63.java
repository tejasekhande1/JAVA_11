
// finally :

import java.io.* ;
class FinallyDemo{
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		try {
			System.out.println("In Try");	
			System.out.println(br.readLine());	

		} catch(IOException obj1){                     
			System.out.println("In Catch");

		} finally{
			System.out.println("In Finally");
			br.close();
		}
	}
}

// WE CAN DECLARE FINALLY WITH TRY BLOCK BUT NOT SINGLE ; IT IS USED FOR CLEAN UP CODE ; IT IS USED TO CLOSE CONNECTIONS OF NETWORKING,DATABASE,FILES ;
// FINALLY CANNOT BE DECLARE MULTIPLY , DECLARE ONCE WITH ONE TRY 
