// Array : int arr[] = {10,20,30,40} ;      int[] intArray     ;  int Array[]

class Array{
	public static void main(String[] args){
	
//		int jarr[] = {10,20,30,40,50};
		
/*		int jarr1[] = {};
		jarr1[0] = 10;                         // RunTime Error deto..java memory det nahi....
		jarr1[1] = 20;
		jarr1[2] = 30;
		jarr1[3] = 40;
		jarr1[4] = 50;       

		for(int i=0 ; i<5 ; i++){
			System.out.println(jarr1[i]);
		}  */

		int[]  arr = new int[5] ;
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		for(int i=0 ; i<5 ; i++){
			System.out.println(arr[i]);
		}
	}
}

/* new int ------ jevha apan new ne Int kaarto array mdhe JVM int la as a Class Treat Karto
 * new na vaparata jar apan int jarr[] asa lihila tr initializer list dyavi lagate
 */
