package string_Problems;

import java.util.Arrays;
import java.util.Collections;

public class SortAStringArray {

	public static void main(String[] args) {
		
		String[] words = {"Volve","BMW","Mers","Toyota","Honda","Hyundai","Maruti"};
		
		//Sort string array in ascending order
		System.out.println("Before sort "+ Arrays.toString(words));
		SortStringArrayInAscendingOrder(words);
		System.out.println("After sort "+ Arrays.toString(words));
		
		System.out.println("##############################################################");
		
		//Sort string array in descending order
		System.out.println("Before sort "+ Arrays.toString(words));
		SortStringArrayInDescendingOrder(words);
		System.out.println("After sort "+ Arrays.toString(words));
		
	}

	public static String[] SortStringArrayInAscendingOrder(String[] Arr) {
		Arrays.sort(Arr);
		return Arr;
	}
	
	public static String[] SortStringArrayInDescendingOrder(String[] Arr) {
		Arrays.sort(Arr,Collections.reverseOrder());
		return Arr;
	}
	
}
