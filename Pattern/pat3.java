class Demo{
	public static void main(String [] args){
		int x = 1 ;
		char y = 65 ;
		for(int i=1 ; i<=4 ; i++){
			for(int j=4 ; j>=i ; j--){
				if(i== 2 || i== 4 )
				{
					System.out.print(x +" ");
					x++ ;
				}
				else
				{
					System.out.print(y +" ");
					y++ ;
				}

			}

			System.out.println();
		}
	}
}
