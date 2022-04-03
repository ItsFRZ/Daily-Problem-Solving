package day4;

import java.util.Iterator;

public class FindDifferences {

	
	public static void main(String[] args) {
		
		int input [] =  {5, 20, 3, 2, 50, 80};
		int n  = 78;
		
		int arr[] = {90, 70, 20, 80, 50} ; 
		n = 45;
		
		
		String ans  = findDifferences(arr, n);
		System.out.println(ans);
	}
	
	
	// Bruteforce 
	public static String findDifferences(int[] arr,int n) {
		
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
	
}
