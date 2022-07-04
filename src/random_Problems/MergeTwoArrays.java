package random_Problems;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		Integer[] intArray1 = {1,2,3,4,5,6,7,8,5,3,4,5,7};
		Integer[] intArray2 = {4,5,6,7,8,6,5,6,7,8,7};
		
		System.out.println("After merge"+Arrays.toString(merge2Arrays(intArray1,intArray2)));
		
		String[] strArray1 = {"My","Name","Is"};
		String[] strArray2 = {"Pardeep", "Kumar"};
		
		System.out.println("After merge"+Arrays.toString(merge2Arrays(strArray1,strArray2)));

	}
	
	public static Object[] merge2Arrays(Object[] Arr1, Object[] Arr2) {
		Object[] mergeArray = new Object[Arr1.length+Arr2.length];
		
		for(int i=0; i<Arr1.length; i++) {
			mergeArray[i] = Arr1[i];
		}
		
		for(int i=0; i<Arr2.length; i++) {
			mergeArray[Arr1.length+i] = Arr2[i];
		}
		
		return mergeArray;
	}
	
	/*
	public static String[] mergeTwoArrays(String[] Arr1, String[] Arr2) {
		String[] mergeArray = new String[Arr1.length+Arr2.length];
		
		for(int i=0; i<Arr1.length; i++) {
			mergeArray[i] = Arr1[i];
		}
		
		for(int i=0; i<Arr2.length; i++) {
			mergeArray[Arr1.length+i] = Arr2[i];
		}
		
		return mergeArray;
	}
*/
}
