import java.util.*;

class BigBazar implements Comparable <BigBazar> {

	String p_Name;
	int prize;

	BigBazar(String p_Name,int prize){
		this.p_Name = p_Name;
		this.prize = prize;
	}

	public String compareTo(BigBazar obj){
		return (String)(obj.p_Name);
	}
}

class TreeSetDemo{
	public static void main(String[] args){
		SortedSet<BigBazar> s = new TreeSet();
		s.add(new BigBazar("Pizza",350));
		s.add(new BigBazar("Snacks",50));
		s.add(new BigBazar("Veg-Burger",45));
		s.add(new BigBazar("NonVeg-Burger",120));

		for(BigBazar obj : s){
			System.out.println(obj.p_Name);
		}
	}
}
