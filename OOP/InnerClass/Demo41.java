
class Admission{
	Admission(String field){
		if(field == "Medical")
			NEET();
		else if(field == "Engg")
			JEE();
	}
	void NEET(){
		class Gov{
			void college(){
				System.out.println("AIIMS");
			}
		}
		class Private{
			void college(){
				System.out.println("Nharati Vidyapeeth");
			}
		}
		
		Gov gvt = new Gov();
		gvt.college();
	}
	
	void JEE(){
		class Gov{
			void college(){
				System.out.println("COEP");
			}
		}
		class Private{
			void college(){
				System.out.println("Sinhgad");
			}
		}

		Private pvt = new Private();
		pvt.college();
	}
}

class Decision{
	public static void main(String[] args){
		Admission adm = new Admission("Engg");
	}
}
