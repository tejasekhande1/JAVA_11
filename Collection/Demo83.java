import java.util.*;
class Employee implements Comparable<Employee> {         // Comparable<class name>
	int empId = 0 ;
	double sal = 0.0 ;

	Employee(int empId,double sal){
		this.empId = empId;
		this.sal = sal;
	}

	public int compareTo(Employee emp){
		return (int)(sal - emp.sal);
	}
}

class CompareDemo{
	public static void main(String[] args){
		SortedSet<Employee> s = new TreeSet();
		s.add(new Employee(10,35000.00));
		s.add(new Employee(43,75000.00));
		s.add(new Employee(8,45000.00));
		s.add(new Employee(5,34000.00));
		s.add(new Employee(20,95000.00));

		System.out.println(s);

		for(Employee obj : s){                          // forage
			System.out.print(obj.empId+ " ");
			System.out.println(obj.sal);
		}
	}
}

// jevha class la implement ekhada interface karto tevha tya interface chi abstract method override karayachi
// x.campareTo(y) ==> INTERNALLY
// if -ve(diff) (x < y) ; +ve(diff) : (x > y) : 0 (x == y )
