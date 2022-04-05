package day6;

import java.util.Arrays;
import java.util.HashMap;

public class FirstMissingNumber {

	
	public static void main(String[] args) {
	
		
		int []arr = {1,2,3,5};
		
		
		
//		int []arr = {4,1,-10,2,9,3};
//		firstMissingNumberV1(arr);
		
//		System.out.println(Arrays.toString(arr));
		int ans = firstMissingNumberV2(new int[] {1,2,0});
		
		System.out.println(ans);
	
	}
	
	
	
	
//	Approach 1 : TC = O(N)  , SC = O(N)
	public static int firstMissingNumberV1(int []arr){
		
		
		if(arr.length == 1 && arr[0] == 1)
			return 2;
		
		if(arr.length == 1)
			return 1;
		
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], true);
		}
		
		int firstMissingNo = -1;
		
		for (int i = 0; i < arr.length; i++) {
			int idx = i+1;
			if(!map.containsKey(idx)) {
				firstMissingNo = idx;
				break;
			}
			
		}
		
		if(firstMissingNo == -1) 
			return arr.length+1;
		else
			return firstMissingNo;
		
	}

	public static int firstMissingNumberV2(int []arr) {
		
		int n = arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > n || arr[i] <= 0)
				arr[i] = n+1;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
		
			int val = Math.abs(arr[i])-1;
			
			if(val != n && arr[val] > 0) {
				arr[val] = -arr[val];
			}
			
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0)
			{
				return i+1;
			}
		}
		
		return n+1;
	}


}
