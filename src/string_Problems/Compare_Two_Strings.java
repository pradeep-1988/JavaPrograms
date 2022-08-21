package string_Problems;

public class Compare_Two_Strings {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		Compare2Strings(str1,str2);
	}
	
	public static void Compare2Strings(String str1, String str2) {
		if(str1.compareTo(str2)>0) {
			System.out.println("str1 is greater that str2");
		}else if(str1.compareTo(str2)<0) {
			System.out.println("str2 is greater that str1");
		}else {
			System.out.println("Both the strings are equal");
		}
	}

}
