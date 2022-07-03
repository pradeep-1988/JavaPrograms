package pattern_based_Problems;

public class Alphabet_Pattern {

	public static void main(String[] args) {
		
		/* Draw below pattern
		 * A
		 * A B
		 * A B C
		 * A B C D
		 * A B C D E
		 * 
		 */
		
		int alpha = 65; // 65 is the ASCAI value of A.
		for(int i=0; i<=10;i++) {
			for(int j= 0; j<=i; j++) {
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		
		System.out.println("#############################################################");
		/* Draw below pattern
		 * A
		 * B B
		 * C C C
		 * D D D D
		 * E E E E E
		 * F F F F F F
		 */
		
		for(int i=0; i<=10;i++) {
			for(int j= 0; j<=i; j++) {
				System.out.print((char)(alpha+i)+" ");
			}
			System.out.println();
		}

	}

}
