class Demo{
	public static void main(String [] args){
		char x = 65 ;
		for(int i=1 ; i<=4 ; i++){
			for(int j=4 ; j>=i ; j--){
				System.out.print(x +" ");
				x++ ;	
			}

	    		System.out.println();
		}
	}
}
