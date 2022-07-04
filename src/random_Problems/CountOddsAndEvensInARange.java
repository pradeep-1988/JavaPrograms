package random_Problems;

public class CountOddsAndEvensInARange {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 20;
		System.out.println("Total count of even numbers in range from "+num1+" to "+num2+" is : "+countEvens(num1,num2));
		System.out.println("Total count of even numbers in range from "+num1+" to "+num2+" is : "+countEvens2(num1,num2));
		System.out.println("Total count of odd numbers in range from "+num1+" to "+num2+" is : "+countOdds(num1,num2));
		System.out.println("Total count of odd numbers in range from "+num1+" to "+num2+" is : "+countOdds2(num1,num2));
	}
	
	
	public static int countEvens(int a, int b){
		int count = 0;
		
		for(int i=a; i<=b; i++) {
			if(i%2==0) {
				count++;
				System.out.println(i);
			}
		}
		
		return count;
	}
	
	
	public static int countEvens2(int lowNum, int highNum){

		if(lowNum%2==0) {
			//lowNum = lowNum-1;
			lowNum--;
		}
		
		if(highNum%2==0) {
			//highNum = highNum+1;
			highNum++;
		}
		
		int count = (highNum-lowNum)/2;
		return count;
	}
	
	
	
	public static int countOdds(int a, int b){
		int count = 0;
		
		for(int i=a; i<=b; i++) {
			if(i%2!=0) {
				count++;
				System.out.println(i);
			}
		}
		
		return count;
	}
	
	public static int countOdds2(int lowNum, int highNum){

		if(lowNum%2!=0) {
			//lowNum = lowNum-1;
			lowNum--;
		}
		
		if(highNum%2!=0) {
			//highNum = highNum+1;
			highNum++;
		}
		
		int count = (highNum-lowNum)/2;
		return count;
	}
	

}
