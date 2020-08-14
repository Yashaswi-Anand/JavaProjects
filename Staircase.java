import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		
		System.out.println("Solve a stairCase Problem -----"); 
		System.out.println("Enter a number for StairCase height:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			for(int j=1;j<=n;j++) {
				
				if(j>=n-i) 
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
