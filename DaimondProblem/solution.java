interface A{  
    default void display() {  
 	   System.out.println("class A display() method called");  
   	 }  
    } 

interface B extends A{    
    default void display(){  
	    System.out.println("class B display() method called");  
   	 }  
    } 

interface C extends A{  
    default void display(){  
	    System.out.println("class C display() method called");  
   	 }  
    }

class D implements B,C{  
	public void display(){
		C.super.display();
	}
	public static void main(String args[]){  
	     	new D().display();   
			}  
	}	  
