package string_Problems;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Bollo";
		System.out.println("##########Before Swap###############");
		System.out.println("str1 is = "+str1+" and str2 is = "+str2);
		
		//Using third variable:
		String temp = "";
		temp = str1; //Hello
		str1 = str2; //Bollo
		str2 = temp; //Hello
		
		System.out.println("##########After Swap###############");
		System.out.println("str1 is = "+str1+" and str2 is = "+str2);
		
		//Without using third variable
		str1 = str1+str2; //BolloHello
		str2 = str1.substring(0, str1.length()-str2.length()); //Bollo
		str1 = str1.substring(str2.length()); //Hello
	
		System.out.println("##########Again After Swap###############");
		System.out.println("str1 is = "+str1+" and str2 is = "+str2);
	}

	
}
