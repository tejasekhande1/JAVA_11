// Multidimentional Array

import java.io.*;
class MDArray{
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter Plane,Rows & Cols : ");
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());

		int marr[][][] = new int[x][y][z] ;
		
		for(int i=0 ; i<x ; i++){
			for(int j=0 ; j<y ; j++){
				for(int k=0 ; k<z ; k++){
					marr[i][j][k] = Integer.parseInt(br.readLine());
				}
			}
		}
		
		System.out.println("1st Plane are : ");
		for(int i=0 ; i<x ; i++){
		
			if (i == 1)
				System.out.println("2nd Palne is :");
		
			for(int j=0 ; j<y ; j++){
				for(int k=0 ; k<z ; k++){
					System.out.print(marr[i][j][k] + " ");
				}
		
				System.out.println(" ");
			}
		}
	}
}
