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
		
//		int ans = logestConsecutiveSubsequence(new int[]{32});
//		System.out.println(ans);

		
		logestConsecutiveSubsequenceV2(arr);
	}
	

	
	
//	Approach 1 : TC - O(nlogn) SC - O(1)
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
	

//	Approach 2 : T - O(n) SC - O(n)
	public static void logestConsecutiveSubsequenceV2(int []arr) {
		
		HashMap<Integer, Boolean> myMap = new HashMap<Integer, Boolean>();
		
		for(int val : arr) {
			myMap.put(val, true);
		}
		
		for(int val : arr) {
			if(myMap.containsKey(val-1)) {
				myMap.put(val, false);
			}
		}
		
		System.out.println(myMap);
		
		int msp  = 0;
		int ml = 0;
		for (int val : arr) {
			int tsp = val;
			int tl = 1;
			if(myMap.get(val) == true) {
			
				while(myMap.containsKey(tsp+tl)) {
					tl++;
				}
				
				if(tl > ml) {
					ml = tl;
					msp = tsp;
				}
				
			}
			
		}
		
		
		System.out.println(ml);
		for (int i = msp; i < msp+ml; i++) {
			System.out.print(i+" ");
		}
		
		
	}
	
}
