package com.dsa;

import java.util.Scanner;

public class OddSumIn_Columns {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rowSize = sc.nextInt();
		
		int columnSize = sc.nextInt();
		
		int[][] matrix = new int[rowSize][columnSize]; 
		
		System.out.println("Enter "+rowSize*columnSize+" Matrix elements:");
		
		for(int i=0; i<rowSize; i++) {
			
			for(int j=0; j<columnSize; j++) {
				
				matrix[i][j] = sc.nextInt();
			}
			
		}
		

		for(int i=0; i<rowSize; i++) {
			
			for(int j=0; j<columnSize; j++) {
				
				System.out.print(matrix[i][j]+" ");
			 
			}
			System.out.println();
			
		}
		System.out.println();
		
		for(int i=0; i<columnSize; i++) {
			
			int sum = 0;
			for(int j=rowSize-1; j>=0; j--) {
				
				if(matrix[j][i]%2==1) {
					sum+= matrix[j][i];
				}
				
			 
			}
			System.out.println(sum);
			
			
		}
		
		
		

	}

}
