// Overriding : Different Classes with Parent-Child Relation 
// 		Examples : Carreer and Marry methods....parents maarry method override by Child Class

class Baba{

	void getProperty(){
		System.out.println("Bunglow");
	}

	void Career(){
		System.out.println("Shahsi Doctor Honar");
	}

	void Marry(){
		System.out.println("Disha Patani");
	}
}

class Shashi extends Baba{

	void Career(){
		System.out.println("Shashi : Engineer");
	}

	void Marry(){
		System.out.println("Shashi : Kriti Sanon");
	}
}

class Kaka{
	public static void main(String[] args){
	
		Baba b = new Baba();
		b.getProperty();
		b.Career();
		b.Marry();
	
		Baba s = new Shashi();        // Shashi s = new Shashi()
		s.getProperty();
		s.Career();
		s.Marry();
	}
}
