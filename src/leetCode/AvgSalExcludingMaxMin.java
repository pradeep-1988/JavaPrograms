package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AvgSalExcludingMaxMin {

	public static void main(String[] args) {
		
		//int[] SalArray = {4000,3000,1000,2000};
		int[] SalArray = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
		
	
		System.out.println(AvergeSalaryExcludingMaxSalAndMinSal(SalArray));
		System.out.println(AvergeSalaryExcludingMaxSalAndMinSal2(SalArray));
		System.out.println(AvergeSalary(SalArray));
	}
	
	//Sort the Array with Arrays class
		public static double AvergeSalaryExcludingMaxSalAndMinSal(int[] Arr){
			Arrays.sort(Arr);
			double sum =0;
			for(int i=1;i<Arr.length-1;i++) {
				sum = sum+Arr[i];
			}
			return sum/(Arr.length-2);

		}
		
		//Sort the Array with Collections after creating ArrayList with All items from Array.
		static double AvergeSalaryExcludingMaxSalAndMinSal2(int[] Arr){
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<Arr.length;i++) {
				list.add(Arr[i]);
			}
			Collections.sort(list);

			double sum =0;
			for(int i=0;i<list.size()-2;i++) {
				sum = sum+list.get(i+1);
			}
			return sum/(list.size()-2);

		}
		
		static double AvergeSalary(int[] Arr){
			double sum =0;
			for(int i=0;i<Arr.length;i++) {
				sum = sum+Arr[i];
			}
			return sum/Arr.length;

		}

}
