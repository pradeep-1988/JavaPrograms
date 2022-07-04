package random_Problems;

import java.util.HashSet;

public class UnionAndIntersectionOfTwoArrays {

	public static void main(String[] args) {
		
		/*
		
		 Input : arr1[] = {1, 3, 4, 5, 7}
		 		 arr2[] = {2, 3, 5, 6} 
		 
		 Output : Union : {1, 2, 3, 4, 5, 6, 7} 
         		  Intersection : {3, 5}
		 */
		
		
		int[] arr1 = {7, 1, 5, 2, 3, 6, 14, 18, 19};
		int [] arr2 = {3, 8, 6, 9, 11, 7};
		
		System.out.println("Union is : "+UnionTwoArrays(arr1, arr2));
		System.out.println("Intersection is : "+IntersectionTwoArrays(arr1, arr2));

	}
	
		//Union of two arrays with HashSet as it doesn't allowed duplicates.
		public static  HashSet<Integer> UnionTwoArrays(int[] arr1, int[] arr2) {
			HashSet<Integer> hSet = new HashSet<Integer>();
			
			for(int i=0; i<arr1.length; i++) {
				hSet.add(arr1[i]);
			}
			
			for(int i=0; i<arr2.length; i++) {
				hSet.add(arr2[i]);
			}
			return hSet;
			
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


}
