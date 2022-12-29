
import java.io.* ;
class Demo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input1 = br.readLine();
		System.out.println(input1);                    // TEJAS

		String input2 = br.readLine();
		System.out.println(input2);                    // C2W 

		System.out.println(input1);                   // TEJAS

		br.close();
		br.readLine();                                // Exception in thread
	}
}

// Notes ------- br.readline --- character by character store karun thevte buffer mdhe
// IOException --- Keyboard kadun data ghetane isr,br che connection changle ahet ka nahi te bghto...nasle tr exception fekto
