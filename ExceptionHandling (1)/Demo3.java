
// COMPILE TIME EXCEPTIONS (IOEXCEPTION) :
// 1] FILE NOT FOUND :
// 2] FOF EXCEPTIOON (FILE HANDLING) :
// INTERUPTED EXCEPTION :
// SQL EXCEPTION (JDBC) : 

// IOEXCEPTION :

import java.io.* ;
class IODemo{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
	}
}
