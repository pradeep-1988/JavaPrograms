package random_Problems;

import java.util.Scanner;

public class Convert_Fahrenheit_to_Celcious {

	public static void main(String[] args) {
		
		System.out.println("Enter temp in Fahrenheit: ");
		Scanner scan = new Scanner(System.in);
		float fr = scan.nextFloat();
		System.out.println("temp in celcious is: "+Fahrenheit_to_Celcious(fr));

	}
	
	public static float Fahrenheit_to_Celcious(float fr) {
		float cl = ((fr-32)*5)/9;
		return cl;
	}

}
