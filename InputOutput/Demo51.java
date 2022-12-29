// INPUT IN ONE LINE AND OUTPUT IN MULTIPLE LINE

import java.io.* ;
import java.util.*;

class Input{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String empDetail = br.readLine();

		StringTokenizer st = new StringTokenizer(empDetail," ");
		int token1 = Integer.parseInt(st.nextToken());
		String token2 = (st.nextToken()).trim();
		double token3 = Double.parseDouble(st.nextToken());
		
		System.out.println("EmpId = "+token1);
		System.out.println("Name = "+token2);
		System.out.println("Salary = "+token3);
	}
}

// String todaychi asel tr StringTokenizer hi method use karavi lagte
// JAR ',' ne separate keli asel string tr trim method ne space kami karta yeto
