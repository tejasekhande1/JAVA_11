class Core2web{

}

class Biencaps extends Core2web{

}

class Demo{

	void m1(Core2web c2w){
		System.out.println("Core2web Method");
	}

	void m1(Biencaps bie){
		System.out.println("Biencaps Method");
	}
}

class Test{

	public static void main(String[] args){
		Demo obj = new Demo();
		obj.m1(new Core2web());
		obj.m1(new Biencaps());

		Core2web cobj = new Biencaps();       // In Overloading ,Core2web reference ahe mhnun tyachya method la call jato
		obj.m1(cobj);
	}
}

// Core2web c2w = new Core2web();         ------------> Asa Compare Karaycha
