// JAGGED ARRAY / IRREGULAR MULTIDIMENTIONAL ARRAY : 

class Array{
	public static void main(String[] args){

//		int [][] arr = {{1,2},{3,4,5},{6,7,8,9}};           // Internally goes like below array
		
		int [][] Xarr = new int[3][] ;

//		Xarr[0] = new int[2];
//		Xarr[1] = new int[3];
//		Xarr[2] = new int[4];

		Xarr[0] = new int[]{1,2};
		Xarr[1] = new int[]{3,4,5};
		Xarr[2] = new int[]{6,7,9};

		for(int i=0 ; i<Xarr.length ; i++){
			for(int j=0 ; j<Xarr[i].length ; j++){
				System.out.print(Xarr[i][j] + " ");
			}

			System.out.println();
		}
	}
}
