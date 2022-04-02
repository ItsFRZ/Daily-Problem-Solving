package day4;

import java.util.Arrays;


public class FindDifferences {

	
	public static void main(String[] args) {
		
		int input [] =  {5, 20, 3, 2, 50, 80};
		int n  = 78;
		
		int arr[] = {90, 70, 20, 80, 50} ; 
		n = 45;
		
		
		int[] narr = {25,75,50,45,10};
		int d = 25;
		
//		String ans  = findDifference(narr, d);
//		String ans =  findDifferenceV2(input, 78);
		
//		System.out.println(ans);
	}
	
	
	// Bruteforce O(n^2)
	public static String findDifference(int[] arr,int n) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j)
					continue;
				
				if(Math.abs(arr[i] - arr[j]) == n)
					return "("+arr[i]+","+arr[j]+")";
				
			}
		}
		
		
		
		return "No Such Pair";
	}


	// Slightly Optimized Approach
	public static String findDifferenceV2(int []arr,int n)
	{
		
		Arrays.sort(arr);
		int  i = 0;
		int j = arr.length-1;
		while(i < arr.length) {
			
			if(arr[j] - arr[i] > n) {
				j--;
			}else if(arr[j] - arr[i] == n)
				return "("+arr[j]+","+arr[i]+")";
			else {
				i++;
				j = arr.length-1;
			}
			
			
		}
		
		
		return "No Such Pair";
	}
	
}
