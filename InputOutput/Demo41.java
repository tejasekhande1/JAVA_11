
import java.io.*;
class Demo{
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Two Numbers");
		int a = Integer.parseInt(br.readLine());
//		String x = br.readLine();
//		int a = Integer.parseInt(x);		
		int b = Integer.parseInt(br.readLine());		

		float c = Float.parseFloat(br.readLine());
		System.out.println("C = "+c);

		System.out.println("a = " +a );
		System.out.println("b = " +b );

		System.out.println("Addition is " +(a+b));
		System.out.println("Substraction is " +(a-b));
	}
}
