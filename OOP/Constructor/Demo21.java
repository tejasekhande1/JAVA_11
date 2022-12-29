
class BCCI{

	String presName = "Ganguly" ;
	int year = 2 ;

	BCCI(){
		System.out.println("In BCCI Constructor");
	}	
}

class IPL {

	IPL(){
		System.out.println("In IPL Constructor");
	}

	IPL(BCCI obj){
		System.out.println("In Parameterized Constructor");
		System.out.println("Pres. Name : " + obj.presName);
		System.out.println("Years : " +obj.year);
	}
}

class Match{
	public static void main(String[] args){
	
		IPL obj = new IPL();
		BCCI b = new BCCI();

		IPL obj2 = new IPL(b);
	}
}
