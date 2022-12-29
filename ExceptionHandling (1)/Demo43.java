
import java.io.* ;
class CheckedDemo{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(br.readLine());

		br.close();
		
		try{
			System.out.println(br.readLine());
		} catch(Exception ref){
			System.out.println("Buffered Pipe Already Closed");

		}	
	}
}
