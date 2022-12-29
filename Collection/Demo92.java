// COMPARATOR : THROUGH SIMPLE WAY

import java.util.*;
class Employee{
	int empId;
	String name;
	float sal;

	Employee(int empId,String name,float sal){
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}

	void display(){
		System.out.println(empId + " " + name + " " + sal);
	}
	
}

class SortBySal implements Comparator<Employee>{
	public int compare(Employee obj1,Employee obj2){
		return (int)(obj1.sal - obj2.sal);
	}
}

class SortByName implements Comparator<Employee>{
	public int compare(Employee obj1,Employee obj2){
		return obj1.name.compareTo(obj2.name);
	}
}

class Demo{
	public static void main(String[] args){
		ArrayList<Employee> al = new ArrayList();
		al.add(new Employee(3,"Kanha",85000));
		al.add(new Employee(1,"Rahul",95000));
		al.add(new Employee(2,"Ashish",75000));

		SortBySal sbs = new SortBySal();
		Collections.sort(al,sbs);
		for(Employee e : al ){
			e.display();
		}
		
		SortByName sbn = new SortByName();
		Collections.sort(al,sbn);
		for(Employee e : al ){
			e.display();
		}
	}
}

// Collections.sort(al--->ArrayList Obj) internally called compareTo() method
// Uses Of Comparable : Collections of objects we can Compare/Sort 
