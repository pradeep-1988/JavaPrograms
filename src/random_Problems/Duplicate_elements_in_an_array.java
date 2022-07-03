package random_Problems;

public class Duplicate_elements_in_an_array {

	public static void main(String[] args) {
		
		int[] intArray = {2,4,5,7,0,0,8,3,4,5,2,0,6,7,8,3,45,7,34,65,22,45,78,5,4,90,5,4,23,56,78};
		
		//int[] intArray = {1,2,3,4,5,6,7,8};		
		boolean flag = false;
		for(int i=0; i<intArray.length; i++) {
			int count = 1;
			for(int j=i+1; j<intArray.length; j++) {
				if(intArray[i] == intArray[j]) {
					count++;
					intArray[j] = -1;
				}
			}
			if(count>1 & intArray[i]!=-1) {
				System.out.println(intArray[i]+":"+count);
				flag = true;
			}
		}
		
		if(!flag)
			System.out.println("No duplicates in int Array");

	}

}
