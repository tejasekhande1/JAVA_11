/* Constructor : 1) Bydefault constructor mdhe 1 st super aste
 * By Default ; class name same as Constructor ; no return type (void also not allowed) ; Memory -> Heap/object ; implicitly call (after obj creation)
 * First Line super aste (for call to parent class constructor) ; used to intialized instance variable */

class PuneCity{

	int x = 10 ;
	String str = "Shashi" ;                // Constructor madhun SCP kade reference astto

	PuneCity(){
		System.out.println("No-Argument Constructor");
	}	

	public static void main(String[] args){
		PuneCity Vadgaon = new PuneCity();
	}
}

// JVM Architecture Daigram
