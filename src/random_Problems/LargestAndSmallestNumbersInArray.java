package random_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestAndSmallestNumbersInArray {

	public static void main(String[] args) {
		
		
		
		int[] intArray = {23,6,45,2348,34,87,5,76,54,37,41,32,654,3};
		System.out.println("##############With the help of sort method from Arrays class##############");
		
		Arrays.sort(intArray);
		System.out.println("Smallest number is "+ intArray[0]);
		System.out.println("Largest number is "+ intArray[intArray.length-1]);
		
		
		
		
		
		int [] intArray2 = {23,6,45,2348,34,87,5,76,54,37,41,32,654,3};
		System.out.println("##################With the help of collection framework####################");
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<intArray2.length;i++) {
			al.add(intArray2[i]);
		}
		
		Collections.sort(al);
		System.out.println("Smallest number is "+ al.get(0));
		System.out.println("Largest number is "+ al.get(al.size()-1));
		
		System.out.println("Smallest number is "+ Collections.min(al));
		System.out.println("Largest number is "+ Collections.max(al));
		
		
		int [] intArray3 = {23,6,45,2348,34,87,5,76,54,37,41,32,654,3};
		System.out.println("##################With the help of for loop####################");
		
		//Find largest number from integer Array
				int largestNum=intArray3[0];
				for(int i=0;i<intArray3.length;i++) {
					if(intArray3[i]>largestNum) {
						largestNum = intArray3[i];
					}
				}
				System.out.println("Largest number is: "+largestNum);
				
				//Find smallest number from integer Array
				int smallestNum = intArray3[0];
				for(int i=0;i<intArray3.length;i++) {
					if(intArray3[i]<smallestNum) {
						smallestNum = intArray3[i];
					}
				}
				System.out.println("Smallest number is: "+smallestNum);
		
		
	}

}
