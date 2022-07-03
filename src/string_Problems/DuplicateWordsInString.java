package string_Problems;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		
		String str = "My name is Pradeep kumar";
		String[] strArray = str.split(" ");
		boolean flag = false;
		for(int i=0; i<strArray.length; i++) {
			int count = 1;
			for(int j=i+1; j<strArray.length; j++) {
				if(strArray[i].equalsIgnoreCase(strArray[j])) {
					count++;
					strArray[j] = "0";
				}
			}
			if(count>1 && strArray[i]!="0") {
				System.out.println(strArray[i]+":"+count);
				flag = true;
			}
		}
		
		if(!flag)
			System.out.println("No duplicates in String");

	}

}
