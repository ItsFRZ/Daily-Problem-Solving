package day4;

import java.util.Arrays;

public class ChocolateDistribution {

	
	
	public static void main(String[] args) {
		
		
		int m = 5;
		int []arr = {3, 4, 1, 9, 56, 7, 9, 12};
		
		int ans = chocolateDistribution(arr, m);
		System.out.println(ans);
	}
	
	
	public static int chocolateDistribution(int []arr,int nos) {
		
		Arrays.sort(arr);
		
		return arr[nos] - arr[0];
	}
	
	
	
}
