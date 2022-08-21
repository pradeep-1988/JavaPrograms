package random_Problems;

import java.util.Scanner;

public class Largest_Of_ThreeNumbers {

	public static void main(String[] args) {

		System.out.println("Enter three numbers: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		if(x>y && x>z) {
			System.out.println("Largest number is first number i.e. : "+x);
		}else if(y>x && y>z) {
			System.out.println("Largest number is second number i.e. : "+y);
		}else if(z>x && z>y){
			System.out.println("Largest number is third number i.e. : "+z);
		}else {
			System.out.println("Entered numbers are same");
		}
	}

}
