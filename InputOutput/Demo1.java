
import java.io.*;                                      // For InputStreamReader and BufferedReader class

class Input{
	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

//		System.out.println(br.readLine());        // throws IO exception to JVM (jyane call kela tyachyakde jato)
	
		String input = br.readLine();
		System.out.println(input);	

	}
}
// br.readline --- buffer mdhla data vachla ani aplyla pathavla
// Default Exception handler -
