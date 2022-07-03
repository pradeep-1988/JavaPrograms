package string_Problems;

public class LongestWordInString {

	public static void main(String[] args) {
		String str = "My name is Pradeep kumar";
		
		System.out.println("Longest word in " +str+ " is : "+LongestWordinAString(str));
		
	}
	
	public static String LongestWordinAString(String str) {
		
		String[] strArr = str.split(" ");
		String LongestWord = "";
		for(int i=0; i<strArr.length; i++) {
			if(strArr[i].length()>LongestWord.length()) {
				LongestWord = strArr[i];
			}
		}
		return LongestWord;
		
	}

}
