package day5;

import java.util.Arrays;
import java.util.HashMap;

public class LongestConsecutivSubsequence {

	
	public static void main(String[] args) {
		
		int []arr = {1,9,3,10,4,20,2};
		int []myArr = {2,2,2,3,6,1,9,4,5,3};
		
		int []testCase1 = {6 ,6 ,2 ,3 ,1 ,4 ,1, 5, 6, 2 ,8 ,7 ,4 ,2 ,1 ,3 ,4 ,5 ,9 ,6};
		
		
	
		System.out.println(Arrays.toString(testCase1));
//		Arrays.sort(testCase1);
//		
//		System.out.println(Arrays.toString(testCase1));
		
		int ans = logestConsecutiveSubsequence(new int[]{32});
		System.out.println(ans);
//	
	}
	
	
	public static int logestConsecutiveSubsequence(int []arr) {
		
		
		if(arr.length == 1)
			return 1;
		
		
		Arrays.sort(arr);
		int max = 0;
		
		
		int count = 1;
		for (int i = 0; i <= arr.length-2; i++) {
			
			int curr = arr[i];
			int next = arr[i+1];
		
			
			if(curr+1 == next) {
				count++;
			}else if(curr == next){
				continue;
			}else {
				count = 1;
			}
			if(count > max)
				max = count;
			
		}
		
		
		return max;
	}
	
}
