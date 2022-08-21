package leetCode;

public class Find_N_distinct_integers_with_zero_sum {
	

	public static void main(String[] args)
	{
		int N = 9;
		requiredNumbers(N);
	}
	
	
	
	
	public static void requiredNumbers(int N) {
		
		for(int i=1; i<=N/2;i++) {
			System.out.print(i+" , "+-i+" , ");
		}
		
		if(N%2==1) {
			System.out.print(0);
		}
	}
}
