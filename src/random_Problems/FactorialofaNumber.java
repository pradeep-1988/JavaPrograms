package random_Problems;

public class FactorialofaNumber {
	//5!= 5*4*3*2*1
	
	public static void main(String[] args) {
		
		int num = 5;
		System.out.println(factorialwithForLoop(num));
		System.out.println(factorialwithwhileLoop(num));
		System.out.println(FactorialwithRecursion(num));
		
	}
	
	
	public static int factorialwithForLoop(int num) {
		int fact = 1;
		
		for(int i=num; i>0; i--) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static int factorialwithwhileLoop(int num) {
		int fact = 1;
		
		while(num>0) {
			fact = fact * num;
			num--;
		}
		return fact;
	}
	
	
	//Recursion: when a function calls itself.
	public static int FactorialwithRecursion(int num) {
		if(num==0) {
			return 1;
		}else {
			return num * FactorialwithRecursion(num-1);
		}
			
	}

}
