
class IndvsNz {
	
	static String stadiumName = "Lord" ;
		int practiceSession = 1 ;

		void India(){
		System.out.println("Indian Team");
		}
	
		void Newzealand(){
		System.out.println("New Zealand  Team");
		}

		public static void main(String[] args){

			System.out.println(stadiumName);

			IndvsNz team1 = new IndvsNz();
			team1.India();
			System.out.println(team1.practiceSession);
	
			IndvsNz team2 = new IndvsNz();
			team2.Newzealand();
			team2.practiceSession = 0 ;
			System.out.println(team2.practiceSession);


		}



}
