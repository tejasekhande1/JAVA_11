
import java.io.*;
class Demo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter First Number");
		int input1 = Integer.parseInt(br.readLine());

		System.out.println("Enter Second Number");
		int input2 = Integer.parseInt(br.readLine());

		System.out.println("Addition is " + (input1 + input2));
	}
}
