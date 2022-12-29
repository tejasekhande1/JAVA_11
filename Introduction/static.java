
class Sununiverse{

	static int waterTank = 1000 ;
		int TV = 1 ;

		void display(){
		System.out.println("Sun Universe");
		}

		public static void main(String[] args){
			System.out.println(waterTank);
		
			Sununiverse k201 = new Sununiverse();
			System.out.println(k201.TV);                  // 1
			System.out.println(k201.waterTank);           // 1000
		
		
			Sununiverse k301 = new Sununiverse();		
			k301.TV = 0;
			System.out.println(k301.TV);			// 0
			System.out.println(k301.waterTank);		// 1000
		
		
			Sununiverse k401 = new Sununiverse();
			System.out.println(k401.TV);                   // 1
			k401.waterTank = 0 ;
			System.out.println(k401.waterTank);            // 0
		
	
			System.out.println(k201.waterTank);		// 0
			System.out.println(k301.waterTank);		// 0
		}

}



// non static variable he main or static method mdhe access karaycha asel tr class cha object banavava lagto.
// multiple class la ekach object nasto
// ekach class che multiple object banau shakto
