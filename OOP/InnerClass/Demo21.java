
class Outer{

	int x = 10;
	static y = 20 ;

	class Inner{
		void xyz(){			
			System.out.println("In Inner Class Method");
		}
	}
}

class InnerDemo{
	public static void main(String[] args){
	
		new Outer().new Inner().xyz();

		/* Outer o = new Outer();
		 * Outer.Inner i = o.new Inner();
		 * i.xyz();
		 */
	 	
	}
}
