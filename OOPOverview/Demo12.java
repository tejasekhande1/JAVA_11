// Inheritance : 

class BCCI{               // by default extends asta Object la as Parent class

	int x = 10 ;

	BCCI(){
		System.out.println("In BCCI Constructor");
	}

	void rules(){
		System.out.println("Rules By BCCI");
	}	
}

class IPL extends BCCI{                // by default extends asta Object la as parent class

	int y = 20 ;

	IPL(){
		System.out.println("In IPL Constructor");
	}

	void rulesIPL(){
		System.out.println("Rules by IPL");
	}	
}

class Match{
	public static void main(String[] args){
		IPL obj = new IPL();
		obj.rulesIPL();
		obj.rules();
	}
}

// In BCCI Constructor
// In IPL Constructor
// Rules By IPL
// Rules by BCCI
