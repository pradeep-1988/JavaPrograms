package random_Problems;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int [] intArray = {1,2,3,4,6,7,8,9,10};
		
		
		//Calculate the sum of numbers available in Array
		int sum = 0;
		for(int i=0;i<intArray.length;i++) {
			sum = sum+intArray[i];
		}
				
		System.out.println("Sum of numbers available in Array: "+sum);
				
		//Calculate the sum of all the numbers from 1 to 10
		int wholeSum = 0;
		for(int j=1;j<=10;j++) {
			wholeSum = wholeSum+j;
		}
				
		System.out.println("Sum of all numbers from 1 to 10: "+wholeSum);
				
		//Missing number
		System.out.println("Missing number in Array is: "+ (wholeSum-sum));
	}

}
