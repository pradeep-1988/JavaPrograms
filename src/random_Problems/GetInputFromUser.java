package random_Problems;

import java.util.Scanner;

/*
 We can use Scanner class from java.util package, to get the input from user.
 */
public class GetInputFromUser {

	public static void main(String[] args) {
		
		int num;
		float fl;
		String str;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string");
		str = scan.nextLine();
		System.out.println("Entered string is "+ str);
		
		System.out.println("Enter an integer");
		num = scan.nextInt();
		System.out.println("Entered integer is "+ num);
		
		System.out.println("Enter a float");
		fl = scan.nextFloat();
		System.out.println("Entered float is "+ fl);
	}

}
