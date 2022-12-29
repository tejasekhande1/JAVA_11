class Demo{
	public static void main(String [] args){
		char x = 'A' ;
		switch(x){
			case 65 :
				System.out.println("1");
				break;

			case 'A' :
				System.out.println("2");
				break;
		}	
	}
}

// output -----> Error ('A' duplicate case)
