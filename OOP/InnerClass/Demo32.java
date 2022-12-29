// this$0 : For Determine On Which Outer Class Object Inner Class is Called
// Constructor : Outer$Inner(Outer cha Object)

class Outer{
	class Inner{
		void m1(){
			System.out.println("In Inner Class");
		}
	}

	public static void main(String[] args){
	
		Outer o1 = new Outer();
		Inner i1 = o1.new Inner();       // Outer&Inner(Outer/o1)
		
		Outer o2 = new Outer();
		Inner i2 = o2.new Inner();       // Outer$Inner(Outer/o2)
	}
}
