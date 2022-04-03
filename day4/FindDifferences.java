package day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDifferences {

	
	public static void main(String[] args) {
		
		int input [] =  {5, 20, 3, 2, 50, 80};
		int n  = 78;
//		
		int arr[] = {90, 70, 20, 80, 50,5,65,} ; 
		n = 45;
//		
//		
//		String ans  = findDifferences(input, 78);
		
		findDiffernecesV2(arr, n);
//		System.out.println(ans);
	}
	
	
	// Bruteforce TC : O(n^2) ,  SC : O(1) 
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

	public static void findDiffernecesV2(int []arr,int n) {
		
		HashMap<Integer, Integer> myMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			myMap.put(arr[i],1);
		}
		
		for (int i = 0; i < arr.length; i++) {
			int ans = arr[i] + n;
			if(myMap.containsKey(ans)) {
				System.out.println("("+arr[i]+","+ans+")");
			}
			
		}
	}
	
	
	

}
