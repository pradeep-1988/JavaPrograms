package leetCode;

public class CountOddNumbersinRange {

	public static void main(String[] args) {
		System.out.println("Count of odd numbers from 10 to 50 is "+countOdds(10,50));
		System.out.println("Count of odd numbers from 10 to 50 is "+countOdds2(10,50));
		
		
		System.out.println("Count of odd numbers from 11 to 50 is "+countOdds(11,50));
		System.out.println("Count of odd numbers from 11 to 50 is "+countOdds2(11,50));
		
		System.out.println("Count of odd numbers from 10 to 51 is "+countOdds(10,51));
		System.out.println("Count of odd numbers from 10 to 51 is "+countOdds2(10,51));
		
		
		System.out.println("Count of odd numbers from 11 to 51 is "+countOdds(11,51));
		System.out.println("Count of odd numbers from 11 to 51 is "+countOdds2(11,51));
	}
	
	static int countOdds(int num1, int num2){
		int count = 0;
		for(int i= num1;i<=num2;i++) {
			if(i%2!=0) {
				count++;
			}
		}
		return count;
	}
	
	// Odd numbers b/w two even numbers = (Big even number - small even number)/2
	static int countOdds2(int num1, int num2){
		
		if(num1%2!=0) {num1--;}
		if(num2%2!=0) {num2++;}
		
		return (num2-num1)/2;
	}
}

