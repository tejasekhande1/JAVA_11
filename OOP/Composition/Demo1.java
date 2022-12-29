// COMPOSITION / RELATIONSHIP BETWEEN OBJECTS :
// Inheritance : OBJECT banvaychi garaj padat nahi..eka class cha dusrya class madhe
 
class Hospital{
	String hName = "Sanchiti";
	int noDoc = 93;

	Doctor obj = new Doctor();

	void service(){
		System.out.println("Good Service");
		visitorDoctor();
	}

	void visitorDoctor(){
		obj.operation();
	}
}

class Doctor{
	String dName = "MK Shah";
	int numHospVisit = 7 ;

	void operation(){
		System.out.println("Specialist in Brain Surgery");
	}
}

class Patient{
	public static void main(String[] args){
		Hospital h = new Hospital();
		h.service();
		h.visitorDoctor();
	}
}
