package random_Problems;

public class AddAllArrayElements {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		int num1 = 10;
		int num2 = 20;
		
		// Add(int[] num) method declared as static so no need to create an object of it's class.
		System.out.println("Sum of all the numbers from int Array is: "+ Add(numbers));		
		System.out.println("Sum of all the numbers from int Array is: "+ Add(new int[] {45,67,34,78,679,6764,967,54,7}));
		
		
		System.out.println("########################################");
		// Add(int a, int b) method not declared as static so need to create an object of it's class.
		AddAllArrayElements obj = new AddAllArrayElements();
		System.out.println("Sum of two the numbers: "+ obj.Add(num1, num2));

	}
	
	
	public int Add(int a, int b) {
		return a+b;
	}
	
	
	public static int Add(int[] num) {
		int sum = 0;
		for(int i =0; i< num.length;i++) {
			sum = sum + num[i];
		}
		return sum;
	}

}
