class A{  
    public void display() {  
 	   System.out.println("class A display() method called");  
   	 }  
    }  
class B extends A{    
    public void display(){  
	    System.out.println("class B display() method called");  
   	 }  
    }  
class C extends A{  
    public void display(){  
 	   System.out.println("class C display() method called");  
   	 }  
    }  

public class D extends B,C{  
    public static void main(String args[]){  
    D obj = new D();  				    //creates ambiguity which display() method to call  
    obj.display();   
    	}  
    }  
