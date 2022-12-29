// Inheritance :

class Core2web{

	Core2web(){
		System.out.println("Core2web Constructor");
	}

	void learning(){
		System.out.println("Guide : Shahsi");
		System.out.println("Programming Language");
	}	
}

class Incubator extends Core2web{

	Incubator(){
		System.out.println("Incubator Constructor");
	}

	void implementation(){

		System.out.println("Projects");
		System.out.println("Self Learning");
	}	
}

class Network extends Core2web{

	Network(){
		System.out.println("Network Constructor");
	}

	void connect(){
		System.out.println("Coders Community");
		System.out.println("Guide : Professionals");
	}	
}

class Students{
	public static void main(String[] args){

		Core2web c2w = new Core2web();
		c2w.learning();
		
		//First Way to Create Object
		Incubator ibtr = new Incubator();
		ibtr.implementation();

/*		//Second Way to Create Object
		Core2web obj = new Incubator();          // Error : jyacha reference ahe tyach obj chya method lach call karta yeto
		obj.implementation();                   */
	}
}
