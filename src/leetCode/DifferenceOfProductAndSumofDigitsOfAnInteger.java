package leetCode;

public class DifferenceOfProductAndSumofDigitsOfAnInteger {

	/*
	 * Given an integer number n, return the difference between the product of its digits and the
	 * sum of its digits. 
	 */
	
	public static void main(String[] args) {
		
		int num = 152;
		System.out.println(subtractProductAndSum(num));
	

	}
	
	public static int subtractProductAndSum(int n) {
		int product = 1;
		int sum = 0;
		while(n!=0) {
			product = product * (n%10);
			sum = sum + (n%10);
			n = n/10;
		}
		return product - sum;
	}
	
}
