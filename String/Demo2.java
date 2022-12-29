class String{

	public static void main(String[] args){

		String s1 = "Core2Web" ;
		String s2 = new String("Core2Web") ;
		String s3 = "Core2Web" ;
		String s4 = new String("Core2Web") ;

		// IN VERSION 1.6

		System.out.println(s1 == s2);        // Fasle
		System.out.println(s1 == s3);		// True
		System.out.println(s2 == s4);		// False

		String s5 = new String("Biencaps");
		String s6 = "Biencaps";
		System.out.println(s5 == s6);		  // False
	
		s5 = s5.intern();                          // Explicitly SCP vr ja asa sangto
		System.out.println(s5 == s6);		  // True
	}
}

// Daigram
