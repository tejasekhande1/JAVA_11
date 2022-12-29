
class CompEngg{

	private String name = "Rahul";
	private int age = 29 ;

	CompEngg(){
		System.out.println("In Constructor");
	}

	CompEngg(String empName , int empAge){
		name = empName ;
		age = empAge ;
	}

	void display(){
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}

class Students{
	public static void main(String[] args){

		CompEngg rahul = new CompEngg();
		rahul.display();
		
		CompEngg Kanha = new CompEngg("Kanha",28);
		Kanha.display();
	}
}
