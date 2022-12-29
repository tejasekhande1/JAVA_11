// Anonymous Inner Class Through InterFace:

interface Player{
	void playerInfo(); 				// public abstract
}

class Batsman{                                          // Batsman$1
	public static void main(String[] args){
		Player obj = new Player(){		
			public void playerInfo(){
				System.out.println("Rohit Sharma");
			}
		};

		obj.playerInfo();
	}
}
