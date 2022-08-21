package string_Problems;

import java.util.Scanner;

public class All_SubStrings_Of_String {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to print it's all substrings"); 
		String str = in.nextLine();
		
		AllSubStrings(str);

	}
	
	public static void AllSubStrings(String str) {
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<=str.length(); j++) {
				String sub = str.substring(i,j);
				System.out.println(sub);
			}
		}
	}

}
