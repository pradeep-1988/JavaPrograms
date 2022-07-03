package random_Problems;

public class ArmstrongNumber {

	//Armstrong number is a number whose sum of cubes of all digits are equal to the number.
	//153 = 1*1*1+5*5*5+3*3*3
	
	public static void main(String[] args) {
		
		int num = 153;
		System.out.println(isAramStrongNum(num));
		

	}
	
	
	public static boolean isAramStrongNum(int num) {
		boolean flag = false;
		int r;
		int sum = 0;
		int temp = num;
		while(num>0) {
			r = num % 10; //3,5,1
			sum = sum + (r*r*r);
			num = num / 10; //15,1,0
		}
		
		if(sum == temp)
			flag = true;
		
		return flag;
		
	}

}
