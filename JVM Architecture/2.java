	
class Capgimini{

	static int noOfEmp = 200000 ;
	int projectCount = 200 ;

	void displayProject(){
	System.out.println(" Capgimini Project Count = " + projectCount);
	}

	static void empInfo(){
	System.out.println(" Capgimini Total Emp = " + noOfEmp);
	}
}

class TCS{

	static int noOfEmp = 300000 ;
	int projectCount = 70 ;

	void displayProject(){
	System.out.println(" TCS Project Count = " + projectCount);
	}

	static void empInfo(){
	System.out.println(" TCS Total Emp = "+ noOfEmp);
	}
}

class ITCompany{
	public static void main(String[] args){
	
		Capgimini pune = new Capgimini();
		pune.projectCount = 130 ;
		pune.displayProject();
		pune.empInfo(); 

		Capgimini chennai = new Capgimini();
		chennai.projectCount = 150 ;
		chennai.displayProject();
		chennai.empInfo();

		TCS mumbai = new TCS();
		mumbai.projectCount = 270 ;
		mumbai.displayProject();
		mumbai.empInfo(); 

		TCS banglore = new TCS();
		banglore.projectCount = 230 ;
		banglore.displayProject();
		banglore.empInfo();
	}

}
