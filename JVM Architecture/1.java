
class CoronaMaha{

	int count = 170000 ;
	void precaution(){
		System.out.println("Kalji Ghya");
		System.out.println("Count = " +count);
	}
	static void impDecision(){
		System.out.println("CM-decision");
	}

	public static void main(String[] args){
	
		CoronaMaha obj = new CoronaMaha();
//		System.out.println(obj.count);
		obj.precaution();
		
		impDecision();	

		CoronaMaha june29 = new CoronaMaha();
		june29.count = 180000 ;
//		System.out.println(june29.count);
		june29.precaution();
		june29.impDecision();
	}

}

// compiler version is less than equal to JVM version
