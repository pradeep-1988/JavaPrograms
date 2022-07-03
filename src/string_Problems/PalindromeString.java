package string_Problems;

public class PalindromeString {

	public static void main(String[] args) {

		String str = "Hellolleh";
		
		IsPalindromeString(str);
	}
	
	
	public static void IsPalindromeString(String str) {
		
		String strRev = "";
		for(int i=str.length()-1;i>=0;i--) {
			strRev = strRev+str.charAt(i);
		}
		//System.out.println(strRev);
		
		if(strRev.equalsIgnoreCase(str)) {
			System.out.println(str+" is a palindrome string");
		}else {
			System.out.println(str+" is not a palindrome string");
		}
		
	}
	

}
