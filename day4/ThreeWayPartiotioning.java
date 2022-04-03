package day4;

import java.util.Arrays;

public class ThreeWayPartiotioning {

	public static void main(String[] args) {
		
		int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};  
        int lowVal = 14; 
		int highVal = 20;
		
		System.out.println(Arrays.toString(arr));
		
		threeWayPartitioning(arr, lowVal, highVal);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void threeWayPartitioning(int []arr,int a,int b) {
		
		int low = 0;
		int mid = 0;
		int high = arr.length-1;
		
		while(mid <= high) {
			
			if(arr[mid] >= a && arr[mid] <= b)
			{
				mid++;
			}else if(arr[mid] < a) {
				swap(arr, mid, low);
				mid++;
				low++;
			}else if(arr[mid] > b) {
				swap(arr, mid, high);
				high--;
			}
			
		}
		
		
		
		
	}
	
	public static void swap(int []arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
}
