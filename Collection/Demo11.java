// Comparator : THROUGH INNER CLASS
// INTERVIEW QUESTIONS : COMPARATOR APPLIED ON TREESET

import java.util.*;
class Politics{
	String leader_Name;
	String party_Name;
	int years;

	Politics(String leader_Name,String party_Name,int years){
		this.leader_Name = leader_Name;
		this.party_Name = party_Name;
		this.years = years;
	}

	public String toString(){
		return leader_Name + " " + party_Name + " " + years ;
	}
}

class SortByName implements Comparator<Politics>{
	public int compare(Politics obj1,Politics obj2){
		return obj1.leader_Name.compareTo(obj2.leader_Name);
	}
}

class ComparatorDemo{
	public static void main(String[] args){

		TreeSet<Politics> ts = new TreeSet<Politics>(new SortByName());

		ts.add(new Politics("Sharad Pawar","NCP",60));
		ts.add(new Politics("Narayan Rane","BJP",52));
		ts.add(new Politics("Udhav Thakare","SS",35));
		ts.add(new Politics("Ashok Chavhan","CON",42));

		System.out.println(ts);	
	}
}
