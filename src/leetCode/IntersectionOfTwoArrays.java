package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

	/*
	 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result 
	 * must appear as many times as it shows in both arrays and you may return the result in any order.
	 * Example 1: Input: nums1 = [1,2,2,1], nums2 = [2,2] | Output: [2,2]
	 * Example 2: Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] | Output: [4,9]
	 */
	
	public static void main(String[] args) {
		
		
		//int[] nums1 = {1,2,2,1};
		//int[] nums2 = {2,2};
				
		//int[] nums1 = {1,2,3,4};
		//int[] nums2 = {2,3,4,5};
				
		int [] nums1 = {1, 2, 2, 2, 2, 2, 2, 2, 1};
		int[] nums2 = {1,2,2};
				
		System.out.println(IntersectionTwoArrays(nums1,nums2));
		System.out.println(Arrays.toString(IntersectionTwoArrays2(nums1,nums2)));

	}
	
	
	public static  HashSet<Integer> IntersectionTwoArrays(int[] arr1, int[] arr2) {
		HashSet<Integer> hSet = new HashSet<Integer>();
		HashSet<Integer> hSet1 = new HashSet<Integer>();
		
		for(int i=0; i<arr1.length; i++) {
			hSet.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length; i++) {
			if(hSet.contains(arr2[i])) {
				hSet1.add(arr2[i]);
			}
				
		}
		
		return hSet1;
	}
	
	public static int[] IntersectionTwoArrays2(int[] nums1, int[] nums2) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		int i=0,j=0;
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i] > nums2[j]) {
				j++;
			}else if (nums2[j]>nums1[i]) {
				i++;
			}else {
				arrList.add(nums1[i]);
				i++;
				j++;
			}
		}
		
		 int[] ret = new int[arrList.size()]; 
		 for(int k = 0; k < arrList.size();k++){
	            ret[k] = arrList.get(k);
		 }
		return ret;
	}

}
