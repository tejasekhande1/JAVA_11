
// STATIC NESTED INNER CLASS : INNER CLASS NOT FULLY DEPENDENT ON OUTER CLASS ; INNER CLASS HAVE THEIR OWN EXISTANCE ; NOT NEED TO CREATE OBJECT OF OUTER CLASS TO ACCESS INNER CLASS ;
// 	WE CANNOT ACCESS NON-STATIC CONTEXT OF OUTER CLASS IN STATIC INNER CLASS

class Hospital{

	static int x = 10 ;

	static class Doctors{                                           // VISITORS DOCTOR
		void serviceAt(){
			System.out.println("Work At Hospital");
			System.out.println(x);
		}
	}

	public static void main(String[] args){
		new Doctors().serviceAt();
	}
}
