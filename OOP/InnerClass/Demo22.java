// Inner Class : Static content declaration chalat nahi     karan Static he agodr picture mdhe yet but Inner Class cha object banvla tarch tyatle static initialize hotil

class Outer{
	
	int x = 10 ;
	static int y = 20 ;

	class Inner{
		void m1(){
			System.out.println(x);
			System.out.println(y);
		}
	}

	public static void main(String[] args){
		new Outer().new Inner().m1();
	}
}
