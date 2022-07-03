package string_Problems;

public class CapitalizeFirstLetterOfEachWord {

	public static void main(String[] args) {
		String str = "my name is pradeep kumar";
		
		System.out.println(Capitalize1stLetterOfEachWordinString(str));
		
	}
	
	public static String Capitalize1stLetterOfEachWordinString(String str) {
		
		String[] strArray = str.split(" ");
		String expStr = "";
		
		for(int i=0; i<strArray.length;i++) {
			expStr = expStr + strArray[i].toUpperCase().charAt(0)+strArray[i].substring(1)+" ";
		}
		
		return expStr;
	}

}
