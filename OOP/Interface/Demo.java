
// INTERFACE : MUST BE 100 PERCENT ABSTRACTION ; CLASS CANNOT INHERITED TO INTERFACE ; INTERFACE DO NOT HAVE ANY PARENT CLASS ; .CLASS FILE BANATE ;
// 	       ONE INTERFACE EXTENDS ANOTHER INTERFACE (daigram 24:31) ; SUPPORT MULTIPLE INHERITANCE (daigram 32:27); 

interface RBI{

	void loanType();                                             // DEFAULT PUBLIC ABSTRACT ASTA
	void ROI() ; 						   // RATE OF INTEREST
}

class SBI implements RBI{

	// super()                                             // CALLS TO OBJECT CLASS

	public void loanType(){                                      // SCOPE KAMI HOTO MHNUN PUBLIC KARAVA LAGTO
		System.out.println("HomeLoan");
	}

	public void ROI(){
		System.out.println("8.95");
	}
}

class Customer{
	public static void main(String[] args){
	
		RBI r = new SBI();
		r.loanType();
		r.ROI();

	}
}
