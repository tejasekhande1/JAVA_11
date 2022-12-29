
// CONCRETE METHOD : A CLASS WHICH HAS BODY.
// ABSTRACT CLASS : A CLASS IN WHICH ONE OR MORE ABSTRACT METHOD ARE PRESENT ; 0 to 100 percentage abstraction asu shakt ; object banat nahi ; 
// 		    REFERENCE GHEU SHAKTO ; CONSTRUCTOR ASTO (BYTECODE)

abstract class Biryani{

	Biryani(){
		System.out.println("Abstract Class Constructor");
	}

	abstract void quantity();

	abstract void prize();

	void taste(){
		System.out.println("Biryani______Best");
	}
}

class PKBiryani extends Biryani{
	

	void quantity(){
		System.out.println("Jast Quantity");
	}
	
	void prize(){
		System.out.println("Average");
	}
}

class SKBiryani extends Biryani{
	

	void quantity(){
		System.out.println("Kami Quantity");
	}
	
	void prize(){
		System.out.println("High");
	}

	public static void main(String[] args){
		Biryani obj = new PKBiryani();                          // ABSTRACT CLASS REFERENCE
		SKBiryani obj2 = new SKBiryani();
	}
}
