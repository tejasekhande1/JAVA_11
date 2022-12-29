// this ha hidden parameter asto constructor and method cha...
// 2) this represents to their class object....3) Static madhe this chalat nahi..bcoz static mdhe non static chlat nahi

class IPL{

	private String playerName = "KLRahul";
	private int runs = 575 ;

	IPL(){								// IPL(IPL *this)
		System.out.println("In No-Argument Constructor");
	}

	IPL(String playerName , int runs){
		System.out.println("In Parameterized Constructor");
		this.playerName = playerName;
		this.runs = runs ;
	}

	void display(){
		System.out.println("PlayerName : " +playerName);
		System.out.println("Runs : " +runs);
	}
}

class IPL2020{
	public static void main(String[] args){
		IPL obj = new IPL();                     
		obj.display();

		IPL obj2 = new IPL("Mayank",550);
		obj2.display();
	}
}
