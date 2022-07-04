package random_Problems;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number1=11;
		System.out.println(number1+" is a prime number: "+ isPrimeNumber(number1));



	}
	
	public static boolean isPrimeNumber(int num) {

		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num % i == 0) {
				return false;
			}	
		}
		return true;
	}
	

}
