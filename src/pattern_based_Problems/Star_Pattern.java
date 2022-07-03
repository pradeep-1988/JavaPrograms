package pattern_based_Problems;

public class Star_Pattern {

	public static void main(String[] args) {
		
		
		/*
		Draw below star pattern
		*		 
		**
		***
		****
		*****
		******
		*******
		********
		*********
		
		*/
		
		for(int i=1; i<=10;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("########################################################");
		
		/*
		 * Reverse pattern of above problem
		 */

		for(int i=10; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("########################################################");
		
		/*
		 Generate below pattern
		      *
		     **
		    ***
		   ****
		  *****
		 */
		
		for(int i=1; i<=10; i++) {
			for(int j=10; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int k =1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("########################################################");
		
		/*
		 Generate below pattern
		 *
		* *
	   * * *
	  * * * *
	 * * * * *
	* * * * * *
		 */
		
		for(int i = 1; i<=10; i++) {
			
			for(int j=10; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int k =1; k<=i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("########################################################");

	}

}
