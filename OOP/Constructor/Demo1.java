// Constructor : class private chalat nahi.... 

class IPL{
	int runs = 200;
	String playerName = "Virat Kohli";
	IPL(){
		System.out.println("Player Name : " + playerName);
		System.out.println("Player Runs : " + runs);
	}
}

class Match{
	public static void main(String[] args){
		IPL ipl2019 = new IPL();
		ipl2019.runs = 300 ;

		IPL ipl2020 = new IPL();
	}
}

/*
class IPL{              ==> class IPL{
				IPL(){}
}			}

class public IPL{       ==> class public IPL{
				public IPL(){}
}			}

class IPL{              ==> class IPL{
public IPL(){}			public IPL(){}
}			}

public  class IPL{      ==> public class IPL{
	IPL(){}			IPL(){}
}			}

class IPL{              ==> class IPL{
private IPL(){}		
}			}

*/
