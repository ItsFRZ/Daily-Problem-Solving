package day1;


import java.util.Arrays;
import java.util.Scanner;


public class AlternateSortingProblem {
	
	
	public static void main(String []args){
	
		
//					  0	  1  2  3  4  5  6  7
		int []arr = {10, 12, 3, 4, 5, 6, 7,8};
//		int []arr = {100,-18,14,-12,10,-5,6};
//		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	
//		alternateSorting(arr);
		arr = alternateSortingV2(arr);
		System.out.println(Arrays.toString(arr));
		
	
		
		
	
	}

	// Approach 1st :- TC : O(n^2) and SC : O(1)
	private static void alternateSorting(int[] arr) {

		for(int i = 0;i < arr.length;i++) {
			
			if(i%2==0) {
				int idx = findMax(i,arr);
				if(idx != -1 && arr[idx] > arr[i]) {
					swap(i,idx,arr);
				}
				
			}else {
				
				int idx = findMin(i,arr);
				if(idx != -1 && arr[idx] < arr[i]) {
					swap(i,idx,arr);
				}
				
			}
			
		}
		
		
	}

	private static int findMin(int i, int[] arr) {
		
		int idx = -1;
		int min = Integer.MAX_VALUE;
		for (int j = i+1; j < arr.length; j++) {
			if(arr[j] < min) {
				min = arr[j];
				idx = j;
			}
		}
		
		
		
		return idx;
	}

	private static int findMax(int i, int[] arr) {
		
		int idx = -1;
		int max = 0;
		for (int j = i+1; j < arr.length; j++) {
			if(arr[j] > max) {
				max = arr[j];
				idx = j;
			}
		}
		
		return idx;
	}

	private static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	
	private static int[] alternateSortingV2(int []arr) {
		
	
		int i = 0;
		int j = arr.length-1;
		int k =0;
		int []earr = new int[arr.length];
		
		
		while(i < j) {
			
			fillArray(i,j,earr,arr,k);
			
			
			i++;
			j--;
			k += 2;
		}
		
		if(arr.length%2 != 0) {
			earr[earr.length-1] = arr[(0+arr.length-1)/2];
		}
		
		return earr;
	}

	private static void fillArray(int i, int j, int[] narr,int[] oarr,int idx) {
		
		narr[idx] = oarr[j]; // large
		narr[idx+1] = oarr[i]; // small
	}

}






