package string_Problems;

public class FrequencyOfALetterinString {

	public static void main(String[] args) {
		
		//String str = "mississippi";
		String str = "My name is Pradeep Kumar";
		
		char[] charArray = str.toCharArray();
		
		for(int i=0; i<charArray.length; i++) {
			int count = 1;
			for(int j = i+1; j<charArray.length; j++) {
				if(charArray[i]==charArray[j]) {
					count++;
					charArray[j] = ' ';  //Assigned the space to all the characters which has been counted.
				}
			}
			if(count>1 && charArray[i]!=' ') {
				System.out.println(charArray[i]+":"+count+" times");
			}
		}
		
		System.out.println("###############################################");
		
	}

}
