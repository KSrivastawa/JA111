package com.dsa;

import java.util.Scanner;

public class All_Twice_Except_One_II {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		
		int[] arr = new int[(size*2) - 1];
		
		int elements = (size*2) - 1;
		
		System.out.println("Enter the "+ elements+" elements, All_Twice_Except_One which are <= "+size+":");
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			
			sum+=(arr[i]);
			
		}
		
		int N =2*(size*(size+1)/2);
		
		
		System.out.println("Missing Number is: "+ (N-sum));
		
		
	}

}
