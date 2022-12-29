// input for 2-d array

import java.util.* ;
class Array{
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Rows and Cols : ");
	int n = sc.nextInt();
	int m = sc.nextInt();

	char arr[][] = new char[n][m];
	for(int i=0 ; i<n ; i++){
		for(int j=0 ; j<m ; j++){
			arr[i][j] = sc.next().charAt(0);
		}
	}

	for(int i=0 ; i<n ; i++){
		for(int j=0 ; j<m ; j++){
			System.out.print(arr[i][j] + " ");
		}

		System.out.println();
	}

	}
}
