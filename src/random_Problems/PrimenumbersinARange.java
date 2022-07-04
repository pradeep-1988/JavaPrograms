package random_Problems;

public class PrimenumbersinARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1=10;
		int number2 = 50;
		PrimeNumberinARange(number1,number2);

	}
	
	public static void PrimeNumberinARange(int a,int b) {
		System.out.print("Prime numbers in range from "+a+" to "+b+" are: ");
		for(int i=a; i<=b; i++) {   
			boolean flag = true;
			for(int j=2; j<=i/2; j++) {    
				if(i%j==0) {                
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.print(i+" ");
			}
		}
		
	}

}
