package day4;

import java.util.Arrays;

public class SortColors {
	
	
	public static void main(String[] args) {
		
		int []arr = {1,1,0,2,0,1,0,2,0,1,1};
		System.out.println(Arrays.toString(arr));
		
		sortColors(arr);
		
		System.out.println(Arrays.toString(arr));
			
	}
	
	
	public static void sortColors(int []arr) {
		
		
		int low = 0;
		int mid = 0;
		int hi = arr.length-1;
		
		while(mid <= hi) {
			
			if(arr[mid] == 0) {
				
				swap(arr,mid,low);
				mid++;
				low++;
			}else if(arr[mid] == 1) {
				mid++;
			}else if(arr[mid] == 2){
				swap(arr,mid,hi);
				hi--;
			}
			
		}
		
	}
	
	
	public static void swap(int []arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
