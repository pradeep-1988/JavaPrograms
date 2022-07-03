package string_Problems;

public class RemoveJunkCharactersFromString {

	public static void main(String[] args) {
		String str = "jbhjbjhb^%%%&^% (*&(*nbhgf 123478!@$#*&^&";
		System.out.println(str);
		
		
		String newStr = str.replace('%', 'h'); // it would replace a specific character with provided character
		System.out.println(newStr);
		
		String newStr2 = str.replaceAll("[%&*(#$!^ @]",""); //It will replace all the specified characters in regex, with empty string
		System.out.println(newStr2);
		
		String newStr3 = str.replaceAll("[^0-9a-zA-Z]", ""); // Here we have used negate sysmbol i.e. ^ in regex, so this statement will replace all the characters from string except regex, with empty string.
		System.out.println(newStr3);
		
	}

}
