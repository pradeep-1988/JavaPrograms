package leetCode;

public class MaximumSubArray {
	
	/*
	 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the 
	 * largest sum and return its sum.
	 * A subarray is a contiguous part of an array.
	 */

	public static void main(String[] args) {
		
		//int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums = {5,4,-1,7,8};
		//int[] nums = {-1};
		System.out.println(maxSubArray(nums));

	}
	
	/*
	 * Start traversing your array, keep each element in the current_sum and every time keep the max of current_sum and 
	 * maximum_sum But the catch here is that if at any point sum becomes negative then no point keeping it because 0 is 
	 * obviously greater than negative, so just make your sum 0.
	 */
	 public static int maxSubArray(int[] nums) {
		int maximum_sum = Integer.MIN_VALUE; //This is the minimum value an integer can have.
		int current_sum = 0;
		
		for(int i=0;i<nums.length;i++) {
			current_sum = current_sum+nums[i]; //5,9,8,15
			
			if(current_sum>maximum_sum) {
				maximum_sum = current_sum; //5,9,9,15
			}
			
			if(current_sum<0) {
				current_sum = 0; 
			}
		}
	
		 return maximum_sum;
	        
	    }

}
