
class IndianDefence{

	IndianDefence(){
		System.out.println("Major General : Bipin Rawat");
	}

	class Army{
		// this$0
		void attack(){
			System.out.println("URI Attack");
		}
	}

	class Navy{
		// this$0
		void attack(){
			System.out.println("Gazi Attack");
		}
	}

	class Airforce{
		// this$0
		void attack(){
			System.out.println("Balkot Attack");
		}
	}

	public static void main(String[] args){
	
		// First Way
	/*	IndianDefence ID = new IndianDefence();
		Army A = ID.new Army();
		A.attack();   */

		// Second Way

		new IndianDefence().new Navy().attack();

	}
}

// Major General : Bipin Rawat
// Gazi Attack
