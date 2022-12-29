// Multidimentional Array

import java.io.*;
class MDArray{
	public static void main(String[] args) throws IOException{

		int x = 2 , y = 3 , z = 3 ;

		int marr[][][] = new int{{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}}};
		
		
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
