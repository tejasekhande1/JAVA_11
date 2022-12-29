class Demo1{
	public static void main(String[] args){

		for(int i=1 ; i<=4 ; i++){
			
			int x = 1 ;
			
			for(int j=3 ; j>=i ; j--){
				System.out.print("  ");
			}
	
			for(int k=1 ; k<=i ; k++){
				System.out.print(x +" ");
				x++ ;
			}

			for(int l=1 ; l<i ; l++){
				System.out.print(x +" ");
				x++ ;

			}
		
			System.out.println();
		}

	}
}
