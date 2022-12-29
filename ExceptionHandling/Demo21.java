
// 1] RUN TIME EXCEPTION :
// D] NUMBER FORMAT EXCEPTION : IF We Enter String or Other or Except Int As Input In Below Code then Exception Occurs

/*
import java.io.* ;
class NumberFormatDemo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
	}
} */

// E] CLASS CAST DEMO :
//
class ClassCastDemo{
	public static void main(String[] args){

		Object o = new Integer(10);
		String s = (String)o ;

	}
}
