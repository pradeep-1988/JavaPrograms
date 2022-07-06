package leetCode;

import java.util.Arrays;

public class TwoSum {
	
	/*
	 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up 
	 * to target.
	 */

	public static void main(String[] args) {

		int[] nums = {3,2,3};
		int target = 6;
		
		System.out.println(Arrays.toString(twoSum(nums,target)));
	}
	
	public static int[] twoSum(int[] Arr, int n) {
		int[] result = new int[2];
		
		for(int i=0; i<Arr.length; i++) {
			for(int j=i+1; j<Arr.length; j++) {
				if(Arr[i]+Arr[j]==n) {
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		
		return result;
		
	}

}
