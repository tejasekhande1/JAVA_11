// DATA STRUCTURE IN JAVA :
// Collection : To overcome heterogeneous drawback of array collection should be used
// 	Disadvantages of Array : We cannot store diff types of data i.e {1,2,3.5,"D"}

/*
class StringArrayDemo{
	public static void main(String[] args){
		String s1 = new String("Amazon");
		String s2 = new String("Google");
		StringBuffer s3 = new StringBuffer("Apple");
		StringBuffer s4 = new StringBuffer("Microsoft");
		String s5 = new String("Tesla");

		Object strArr[] = new Object[] {s1,s2,s3,s4,s5};       // Object -> konte pn child chaltat...kontya pn type cha data theu shakto

		for(int i=0 ; i<strArr.length ; i++){
			System.out.println(strArr[i]);
		}
	}
} */

class stateCapital{

	String state;
	String capital;

	stateCapital(String state , String capital){
		this.state = state;
		this.capital = capital;
	}
}

class userDefineClass{
	public static void main(String[] args){
		stateCapital obj1 = new stateCapital("Maha","Mumbai");
		stateCapital obj2 = new stateCapital("Bihar","Patana");
		stateCapital obj3 = new stateCapital("Jharkhand","Ranchi");

		stateCapital sc[] = new stateCapital[] {obj1,obj2,obj3};

		for(int i=0 ; i<sc.length ; i++){
			System.out.print(sc[i].state);
			System.out.println(" : " + sc[i].capital);
		}
	}
}
