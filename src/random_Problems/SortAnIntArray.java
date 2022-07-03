package random_Problems;

import java.util.Arrays;
import java.util.Collections;

public class SortAnIntArray {

	public static void main(String[] args) {

		System.out.println("#################With sort method from Arrays class#############");
		int[] intArray = {34,65,22,45,78,5,4,90,5,4,23,56,78};
		System.out.println("Before sort "+ Arrays.toString(intArray));
		SortintArray(intArray);
		System.out.println("After sort "+ Arrays.toString(intArray));
		
		
		
		System.out.println("#################With For Loop###################################");
		int[] intArray2 = {34,65,22,45,78,5,4,90,5,4,23,56,78};
		System.out.println("Before sort "+ Arrays.toString(intArray2));
		SortintArraywithLoop(intArray2);
		System.out.println("After sort "+ Arrays.toString(intArray2));
		
		
	}
	
	public static int[] SortintArray(int[] Arr) {
		//With the help of sort method from Arrays class
		Arrays.sort(Arr);
		return Arr;
	}
	
	
	public static int[] SortintArraywithLoop(int[] Arr) {
		//With the help of loop
		for(int i=0; i<Arr.length;i++) {
			for(int j=i+1; j<Arr.length;j++) {
				if(Arr[i]>Arr[j]) {
					int temp = 0;
					temp = Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = temp;
				}
			}
		}
		return Arr;
	}
	

}
