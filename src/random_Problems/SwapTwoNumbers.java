package random_Problems;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("a = "+a+" and b = "+b);
		
		//Using third variable
		int temp = a; // 10
		a = b; //20
		b = temp; //10
		System.out.println("a = "+a+" and b = "+b);
		
		//without using third variable: with + operator
		a = a+b; //30
		b = a-b; //10
		a = a-b;//20
		
		System.out.println("a = "+a+" and b = "+b);
		
		//without using third variable: with * operator
		a = a*b; //200
		b = a/b; //10
		a = a/b; //20
		System.out.println("a = "+a+" and b = "+b);
	}

}
