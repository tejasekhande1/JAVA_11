class Demo{
	public static void main(String [] args){
		
		int y = 1 ;
		int z = 1 ;
		int x = 0 ;

		for(int i=1 ; i<=3 ; i++){
			for(int j=1 ; j<=3 ; j++){
			
				x = z*y - 1 ;
				System.out.print(x + " ");
				y++ ;
				z++ ;			
			}
				System.out.println();
		}
	
	}

}
