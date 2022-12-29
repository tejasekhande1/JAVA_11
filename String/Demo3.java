// Constructor in Strings : 

class IPL{

	IPL(){
		System.out.println("Dubai");
	}

	IPL(String sponser){
		System.out.println(sponser);
	}
}

class Demo{
	public static void main(String[] args){
	
		IPL obj1 = new IPL();
		IPL obj2 = new IPL("Dream11");

	}
}
