package string_Problems;

public class ReverseAString {

	public static void main(String[] args) {
		
		String str = "My name is Pradeep";
		
		System.out.println("Reverse of string "+str+" is: "+ReverseString(str));
		System.out.println("Reverse of string "+str+" is: "+ReverseUsingStringBuffer(str));
		
		String str2 = "Hello123Hello";
		System.out.println("Reverse of string "+str2+" is: "+ReverseString(str2));
		System.out.println("Reverse of string "+str2+" is: "+ReverseUsingStringBuffer(str2));

	}
	
	public static String ReverseString(String str) {
		
		String revStr="";
		for(int i=str.length()-1; i>=0;i--) {
			revStr = revStr+str.charAt(i);
		}
		return revStr;
	}
	
	
	public static StringBuffer ReverseUsingStringBuffer(String str) {

		
		StringBuffer sf = new StringBuffer(str);
		StringBuffer revStr = sf.reverse();
		
		return revStr;
		
	}

}
