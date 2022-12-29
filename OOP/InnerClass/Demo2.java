
class Outer{

	int x = 10;

	class Inner{
		void xyz(){
			System.out.println("In Inner Class Method");
		}
	}

	void OuterXyz(){
		System.out.println("In Outer Class Method");		
		System.out.println(x);
		
		new Inner().xyz();		
	}

	public static void main(String[] args){
		new Outer().OuterXyz();
	}
}
