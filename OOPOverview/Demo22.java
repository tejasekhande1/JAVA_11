/* Abstraction : Example : TV remote working internally..when we changed Channel no
 * Abstract Class : 2 types chya method astat 
 * 			void m1(){}; ----> complete method or Concrete Method
 * 			abstract void marry(); ------> Abstract Method
 * 1) Incomplete Class ; class chya agodr abstract keyword use karaycha ahe ; 0 to 100 % abstraction use karta yet ; parent class chi method child class jar override karnar asel tar Abstrct method/class use karaycha ahe..; cannot made a object of abstract class ; reference banto abstract class cha */

abstract class Baba{
	void getProperty(){
		System.out.println("Bunglow + Car");
	}

	abstract void marry();
}

class Shashi extends Baba{
	void marry(){
		System.out.println("Kriti Sanon");
	}
}

class Demo{
	public static void main(String[] args){
		Shashi s = new Shashi();
		s.marry();
		s.getProperty();

		Baba b = new Shashi();      // reference of Shashi
		b.marry();
	}
}

// for bytecode : javap -c Baba.class
