package random_Problems;

public class Palindrome_Number {

	// Palindrome number is the number which is same on reversing it.
	// 151, 1441, 5665
	
	public static void main(String[] args) {
		int num = 113311;
		System.out.println(isPalindromeNum(num));
		

	}
	
	public static boolean isPalindromeNum(int num) {
		boolean flag = false;
		int orgNum = num;
		int revNum = 0;
		int r;
		while(num>0) { 
			r = num % 10; //1,3,3,1
			revNum = revNum*10 + r; //1,13,133,1331
			num = num/10; //133,13,1,0
		}
		if(revNum == orgNum) {
			flag = true;
		}
		return flag;
	}

}
