package leetCode;

import java.util.Arrays;

public class LargestPerimeterTriangle {
	
	/*
	 * Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three
	 * of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] nums = {2,1,2};
		int [] nums = {3,2,3,4,5,6,3,4,2}; //2,3,3,4
		
		System.out.println(PerimeterOfTraingle(nums));
	}
	
	static int PerimeterOfTraingle(int[] nums) {
		Arrays.sort(nums);

		for(int i=nums.length-1;i>1;--i) {
			if(nums[i]<nums[i-1]+nums[i-2]) {
				return nums[i]+nums[i-1]+nums[i-2];
			}		
		}
		return 0;
	
	}


}
