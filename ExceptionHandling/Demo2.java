
// TYPES OF EXCEPTION AND HIERACHRY : DAIGRAM
// 1] RUN TIME EXCEPTION (UNCHECKED ----> COMPILER CANT CHECK IT) :
// A] ARITHMETIC EXCEPTION : 

/* class ArithmeticDemo{
	public static void main(String[] args){
		
		System.out.println("Exception Demo : ");
		System.out.println(10/0);
	}
} */

// B] NULL POINTER : 
/* class NullPointerDemo{
	public static void main(String[] args){
		NullPointerDemo obj = null ;
		obj.fun();
	}

	void fun(){
		System.out.println("In Fun");
	}
} */

// C] INDEXOUT => ARRAY AND STRING INDEX OUT OF BOUND:

/* class IndexOutDemo{
	public static void main(String[] args){
		int arr [] = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

//		System.out.println(arr[3]);

		String s = "Shashi";
		System.out.println(s.charAt(7));
	}
} */

// D] INPUT MISS MATCH EXCEPTION :

import java.util.* ;
class InputException{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
	}
}
