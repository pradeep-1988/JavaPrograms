package string_Problems;

public class ReverseWordsofAString {

	public static void main(String[] args) {

		String str = "My name is Pradeep";
		System.out.println(RevWordsOfAString(str));
		
	}
	
	public static String RevWordsOfAString(String str) {
		String[] arr = str.split(" ");
		String revStr = "";
		
		for(int i=0;i<arr.length;i++) {
			for(int j = arr[i].length()-1; j>=0; j--) {
				revStr = revStr + arr[i].charAt(j);
			}
			revStr = revStr+" ";
		}
		
		return revStr;
	}

}
