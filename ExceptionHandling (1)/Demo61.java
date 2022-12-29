
// TRY WITH MULTIPLE CATCH BLOCK :

import java.io.*;
class MultiCatch{
	public static void main(String[] args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println(10/2);
			br.close();
			System.out.println(br.readLine());

		} catch(ArithmeticException A){
			System.out.println("Arithmetic Exception");
		} catch(IOException ie){
			System.out.println("IOException in Catch");
		}
	}
}

// 5
// IOException in Catch
