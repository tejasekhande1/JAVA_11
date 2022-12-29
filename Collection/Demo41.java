
import java.util.*;

class ITCompany{

	String cname = null ;
	int empCnt = 0 ;

	ITCompany(String cname,int empCnt){
		this.cname = cname ;
		this.empCnt = empCnt ;
	}

	void info(){
		System.out.println("Company Name = " + cname + " EmpCnt = " + empCnt);
	}
}

class ArrayListDemo{
	public static void main(String[] args){
	
		ArrayList al = new ArrayList();
	
		al.add(new ITCompany("Biencaps",25));
		al.add(new ITCompany("Bitwise",250));
		al.add(new ITCompany("Apple",25));
		al.add(new ITCompany("Microsoft",25));

//		System.out.println(al);                        ----> ITCompany@4213200
		
		ListIterator litr = al.listIterator();
		while(litr.hasNext()){
			ITCompany obj = (ITCompany)litr.next();     // typecasting
			obj.info();
		}
	}
}
