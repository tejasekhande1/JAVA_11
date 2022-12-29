class LogicalDemo{
	public static void main(String [] args){
		int x = 2 ;
		int y = 3 ;
		boolean ans ;

		ans = (++x < y++) && (x++ < ++y) ;         
		System.out.println("ans = " + ans);        // true 
		System.out.println("x = " + x);		// 4
		System.out.println("y = " + y);		// 5

		ans = (++x <= y++) || (x++ > ++y) ;  
		System.out.println("ans = " + ans);     // true
		System.out.println("x = " + x);		// 6
		System.out.println("y = " + y);		// 7
	}

}
