package leetCode;

import java.util.Arrays;
import java.util.HashSet;

public class CheckIntArrayforDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* Given an integer array nums, return true if any value appears at least twice in the array, and return false 
		  * if every element is distinct.
		  */
				
		//int[] nums = {1,1,1,3,3,4,3,2,4,2};
		int[] nums = {1,2,3,4,5};
				
		System.out.println(containsDuplicate(nums));
		System.out.println(containsDuplicate2(nums));
		System.out.println(containsDuplicate3(nums));
		System.out.println(containsDuplicate4(nums));

	}
	
	public static boolean containsDuplicate(int[] Arr) {
		boolean flag = false;
		
		for(int i=0; i<Arr.length; i++) {
			for(int j=i+1; j<Arr.length; j++) {
				if(Arr[i]==Arr[j]){
					flag = true;
					break;
				}
			}
		}
		return flag;
	}
	
	public static boolean containsDuplicate2(int[] Arr) {
		boolean flag = false;
		HashSet<Integer> hS = new HashSet<Integer>();
		for(int i=0; i<Arr.length; i++) {
			if(!hS.add(Arr[i])) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	static boolean containsDuplicate3(int[] nums){
		boolean flag = false;
		HashSet<Integer> hSet = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			hSet.add(nums[i]);
		}
		
		if(hSet.size()!=nums.length) {
			flag = true;
		}
		return flag;
	}
	
	static boolean containsDuplicate4(int[] nums){
		boolean flag = false;
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length-1;i++) {
			if(nums[i]==nums[i+1]) {
				flag = true;
				break;
			}
		}
		
		return flag;
	}

}
