
// POLYMORPHISM : ONE FUNCTION DIFF BEHAVIOUR
// 1] OVERLOADING : IN SAME CLASS
// 2] OVERRIDING : IN TWO CLASSES WHICH IS INHERITED WITH EACH OTHER

// 1] OVERLOADING : METHOD SIGNATURE => m1(int) ; m2(float,char)

class OverDemo{

	void m1(char x){
		System.out.println("In m1 - char");
	}

	void m1(int y){
		System.out.println("In m1 - int");
	}


	public static void main(String[] args){
		OverDemo obj = new OverDemo();
		obj.m1('A');                          // Automatic promotion karto char(code madhe nasel tr) to int
		obj.m1(10);
	}
}

// C madhe Same function chalat nahi...but java,python,c++ madhe same function chalt but diff parameter dyave lagtat
