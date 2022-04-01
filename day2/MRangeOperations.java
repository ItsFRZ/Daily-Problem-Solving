package day2;

import java.util.Scanner;

/*


Consider an array of size n with all initial values as 0, we need to perform following m range increment operations.
increment(a, b, k) : Increment values from 'a' to 'b' by 'k'.
After m operations, we need to calculate the maximum of the values in the array.
Input : n = 4 m = 4
 a = 1, b = 2, k = 603
 a = 0, b = 0, k = 286
 a = 3, b = 3, k = 882
 a = 0, b = 3, k = 10
Output : 892
Explanation:
Initially array = {0, 0, 0, 0}
After first operation:
array = {0, 603, 603, 0}
After second operation:
array = {286, 603, 603, 0}
After third operation:
array = {286, 603, 603, 882}
After fourth operation:
array = {296, 613, 613, 892}
Maximum element after m operations is 892.
Target Complexity : Time O(n)



*/


/*
 
 
 
 1) Input for Program
 
 	4 4
 	1 2 603
 	0 0 286
 	3 3 882
 	0 3 10
 	
 	Expected Output :- 892
 
 
 2) Input for Program
 
 	5 4 
 	0 2 20
 	1 3 50
 	2 4 5
 	0 3 3
 
 	Expected Output :- 78
 */

public class MRangeOperations {

	public static Scanner ob = new Scanner(System.in);
	
	public static void main(String[] args) {
//		mRangeV1();
		mRangeV2();
		
	}
	
	
	

	
//	Approach One :- TC :- O(M*N) , SC : O(1)
	public static void mRangeV1() {
		
		System.out.println("Enter value for n");
		int n = ob.nextInt();
		
		
		System.out.println("Enter value for m");
		int m = ob.nextInt();

	
		int []arr = new int[n];
		
		
		int max = 0;
		
		
		for (int i = 0; i < m; i++) {
		
			

			System.out.println("Enter value for a");
			int a = ob.nextInt();

			System.out.println("Enter value for b");
			int b = ob.nextInt();

			System.out.println("Enter value for k");
			int k = ob.nextInt();
			
			max = Math.max(mRangeIncrementV1(arr,a,b,k), max);
		}
		
		System.out.println("Maximum Value is : "+max);
	}
	
	public static int mRangeIncrementV1(int []arr,int a,int b,int k) {
		int max = 0;
		for (int i = a; i <= b; i++) {
			arr[i] += k;
			if(arr[i] > max)
				max = arr[i];
		}
		
		return max;
	}
	
//	Approach One :- TC :- O(N) , SC : O(1)
	public static void mRangeV2() {
		
		System.out.println("Enter value for n");
		int n = ob.nextInt();

		System.out.println("Enter value for m");
		int m = ob.nextInt();

		
		int []arr = new int[n+1];
		
		
		
		for (int i = 0; i < m; i++) {
		
			
			System.out.println("Enter value for a");
			int a = ob.nextInt();

			System.out.println("Enter value for b");
			int b = ob.nextInt();

			System.out.println("Enter value for k");
			int k = ob.nextInt();
			
			arr[a] += k;
			arr[b+1] -= k;
			
		
		}
		
		int max = arr[0];
		for (int i = 1; i < arr.length-1; i++) {
			arr[i] += arr[i-1];
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		
		System.out.println("Maxium Value is "+max);
	}

}
