// compareTo : return type INTEGER......first length compare nahi karati

class StringDemo{
	public static void main(String[] args){

		String s1 = "Shashi" ;
		String s2 = new String("Shashi");		
		String s3 = "Biencaps";
		String s4 = "Bielearn" ;

		System.out.println(s1.compareTo(s2));		// 0                if String Same
		System.out.println(s2.compareTo(s3));		// 17         
		System.out.println(s3.compareTo(s4));		// 2
		System.out.println(s3.compareTo(s1));		// -17
	}
}

// check Assci Value of S and B and Print Diff between them
// Bielearn asta tr l-n ascci value
