package random_Problems;

public class MultiplicationTable_Of_GivenNum {

	public static void main(String[] args) {
		int num = 5;
		MultiplicationTable(num);
	}
	
	public static void MultiplicationTable(int num) {
		
		for(int i=1; i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}

}
