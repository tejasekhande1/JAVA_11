
import java.io.*;
class UserInput{
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());

		int[] iarr ;
		iarr = new int[x];

		for(int i=0 ; i<iarr.length ; i++){                          // i<x also
			iarr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Array Elements : ");
		for(int i=0 ; i<x ; i++){
			System.out.println(iarr[i]);
		}
	}
}
