package random_Problems;

public class ReverseAnInteger {

	public static void main(String[] args) {
		int num = 123456789;
		
		System.out.println(num/10); // Gives the reminder
		System.out.println(num%10); //Gives the quotient
		
		
		
		System.out.println("Reverse of "+num+" is : "+ReverseANum(num));
		System.out.println("Reverse of "+num+" is : "+ReverseUsingStringBuffer(num));
	}
	
	public static int ReverseANum(int num) {
		
		int revNum = 0;
		int r;
		
		while(num>0) {
			r = num % 10;
			revNum = revNum*10 + r;
			num = num / 10;
		}
		
		return revNum;
		
	}
	
	public static StringBuffer ReverseUsingStringBuffer(int num) {

		
		StringBuffer sf = new StringBuffer(String.valueOf(num));
		StringBuffer revNum = sf.reverse();
		
		return revNum;
		
	}

}
