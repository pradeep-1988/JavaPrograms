package random_Problems;

import java.util.Scanner;

/*
 Floyd Triangle
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
 
 */

public class FloydTriangle {

	public static void main(String[] args) {

		System.out.println("Enter the number of rows of floyd's triangle you want to print");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Floyd_Triangle(num);
	}
	
	public static void Floyd_Triangle(int num) {
		int n = 1;
		for(int i=1; i<=num; i++) {
			for(int j=0;j<i;j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
			
		}
	}

}
