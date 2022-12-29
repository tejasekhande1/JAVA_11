// POLYMORPHISM : 
// 1] Same Class = Overloading 2] Diff Classes (Parent-Child Reln) = Overriding 
// Instance Variable : Direct Accesseble only in Instance method ; also in Static methods by Creating Obj 
// A] Overloading : Example : In Corona Scenario , Bed() ; Bed(Ventilator or ICU)

class Hospital{

	void getBed(){
		System.out.println("Normal Bed");
	}

	void getBed(String specific){
		System.out.println("ICU Bed");
	}
}

class Patient{
	public static void main(String[] args){

		Hospital h = new Hospital();
		h.getBed("ICU Bed");
		h.getBed();
		
	}
}
