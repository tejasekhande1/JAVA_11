
import java.util.*;

class CompanyInfo{
	String compName;
        double sal;	
	CompanyInfo(String compName,double sal){
		this.compName = compName;
		this.sal = sal;
	}

	public String toString(){
		return " " + compName + " : " + sal + " " ;
	}
}

class Friends{
	public static void main(String[] args){
		HashMap<String,CompanyInfo> h = new HashMap<String,CompanyInfo>();
		h.put("Ashsish",new CompanyInfo("GSLab",1000000));
		h.put("Kanha",new CompanyInfo("Infosys",1400000));
		h.put("Rahul",new CompanyInfo("BMC Software",1200000));
		h.put("Badhe",new CompanyInfo("CarPro",1300000));

		System.out.println(h);
	}
}
