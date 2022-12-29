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

	void dispData(){
		System.out.println(leader_Name + " " + party_Name + " " + years);
	}
}

class SortByName implements Comparator<Politics>{
	public int compare(Politics obj1,Politics obj2){
		return obj1.leader_Name.compareTo(obj2.leader_Name);
	}
}

class ComparatorDemo{
	public static void main(String[] args){
		ArrayList<Politics> al = new ArrayList<Politics>();
		al.add(new Politics("Sharad Pawar","NCP",60));
		al.add(new Politics("Narayan Rane","BJP",52));
		al.add(new Politics("Udhav Thakare","SS",35));
		al.add(new Politics("Ashok Chavhan","CON",42));

		Collections.sort(al,new SortByName());
		for(Politics p : al){
			p.dispData();
		}

		System.out.println("=====================");	

		Comparator<Politics> sortByYears = new Comparator<Politics>(){
			public int compare(Politics obj1,Politics obj2){
				return obj1.years - obj2.years;
			}
		};

		Collections.sort(al,sortByYears);
			for(Politics p : al){
				p.dispData();
			}		
	}
}
