class Array1{
	public static void main(String[] args){
	
		int[] jarr = new int[5];              // Special Class which represent integer type array

		jarr[0] = 10 ;
		jarr[1] = 20 ;
		jarr[2] = 30 ;
		jarr[3] = 40 ;
		jarr[4] = 50 ;

		for(int i=0 ; i<5 ; i++){
			System.out.println(jarr[i]);
		}

		System.out.println(jarr.getClass());
	}
}

/* OUTPUT -----
 * 10
 * 20
 * 30
 * 40
 * 50
 * [I             // runtime signature           Float cha Array asel tr [F asa yeta
 */
