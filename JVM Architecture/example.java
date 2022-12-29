class Rohit {

	static int runsinSeason = 9151 ;
	int highScore = 0 ;

	void displayScore(){
	System.out.println("Rohit High Score in Season = " +highScore);
	}

	static void totalrunsinSeason(){
	System.out.println("Rohit Total Runs in Season = " +runsinSeason);
	}
}

class Kohali {

	static int runsinSeason = 9029 ;
	int highScore = 0 ;

	void displayScore(){
	System.out.println("Kohali High Score in Season = " +highScore);
	}

	static void totalrunsinSeason(){
	System.out.println("Kohali Total Runs in Season = " +runsinSeason);
	}
}

class ICC{

	public static void main (String [] args){

	Rohit ODI = new Rohit();
	ODI.highScore = 211 ;
	ODI.displayScore();
	ODI.totalrunsinSeason();

	Rohit T20 = new Rohit();
	T20.highScore = 107 ;
	T20.displayScore();
	T20.totalrunsinSeason();

	Kohali ODI1 = new Kohali();
	ODI1.highScore = 181 ;
	ODI1.displayScore();
	ODI1.totalrunsinSeason();

	Kohali T201 = new Kohali();
	T201.highScore = 105 ;
	T201.displayScore();
	T201.totalrunsinSeason();

	}
}
