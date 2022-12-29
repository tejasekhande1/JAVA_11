// CONCAT method : return type STRING ; String concat(anotherString); 

class StringDemo{
	public static void main(String[] args){

		String s1 = "Shashi" ;
		String s2 = "Bagal" ;
		
		System.out.println(s1);                  // Shashi
		System.out.println(s2);			// Bagal
		System.out.println(s1.concat(s2));
	}
};

// Previous Scenario :			OUTPUT
// Same length String :			  0
// Shashi Biencaps			 -17
// Shashi Shashikant		         -3
// Biencaps Bienlearn  		  	  2
