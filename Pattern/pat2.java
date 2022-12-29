
class Demo{
	public static void main(String [] args){
		int x = 1 ;
		char y = 65 ;
		for(int i=1 ; i<=4 ; i++){
			for(int j=4 ; j>=i ; j--){
				if( j== 4 || j==2)
				{
		
					System.out.print(x +" ");
				}

				else
				{
					System.out.print(y +" ");
					y++ ;
				}
			
				x++ ;
		
			}
			
			
			System.out.println();
		}
	}
}
