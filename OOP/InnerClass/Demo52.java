
// ANONYMOUS INNER CLASS : A CLASS WHICH DO NOT HAVE NAME ; OBJECT BANLYAVE RUNTIME LA METHOD OVVERIDE KELI JATE TITHE EK UNNAME CLASS BANTO
// REAL TIME EXAMPLE : ARRANGE GOA TRIP CANCAL AT ANY TIME THEN ARRANGE ANOTHER LOCATION AT THAT TIME ;
// DEFAULT CONSTRUCTOR COMPILER DETO MANUALLY DETA YET NAHI

class TripPlan{
	void place(){
		System.out.println("Oooooh Goa !!!");
	}
}

class Today{
	public static void main(String[] args){
		TripPlan obj = new TripPlan(){
			void place(){						// ANONYMOUS INNER CLASS ; Parent Class TripPlan ahe
				System.out.println("Alibaag");
			}
		};

		obj.place();
	}
}

// ALIBAAG
