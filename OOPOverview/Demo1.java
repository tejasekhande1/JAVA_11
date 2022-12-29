/* Class : Protocol or Blueprint of specific thing which gives information about it; object : class chi ashi gosht jyala jaga lagte or Instance of Class
 	   Example : class : IPL ; object : Mumbai Indians or Team       */

class IPL{
	String pName = "KLRahul" ;
	int runs2020 = 524 ;
	static int totalRuns = 5230 ;

	void playerInfo(){
		System.out.println("Player Name : "+ pName);
		System.out.println("IPL 2020 Runs : "+ runs2020);
		System.out.println("IPL Total Runs : "+ totalRuns);
	}

	public static void main(String[] args){
		IPL obj = new IPL();
		obj.playerInfo();
	
		System.out.println("Player Name : "+ obj.pName);
		System.out.println("IPL 2020 Runs : "+ obj.runs2020);
		System.out.println("IPL Total Runs : "+ totalRuns);
	}
}


// static method called by their class name like as : IPL.staticMethod()
// Encapsulation : Collection of Data members(variables) and methods which performed on data member in a class
// 		   Java class is default Encapsulation
// Instance Var : 52:01       ; Static Var : 55:35
