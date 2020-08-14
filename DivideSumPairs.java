
import java.util.Scanner;

public class DivideSumPairs {
	
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		System.out.println("Enter the key of array:");
		int key = sc.nextInt();
		System.out.println("Enter the element of array:");
		int ar[] = new int[n];
		
		
		for(int i=0; i<ar.length;i++) {	ar[i] =sc.nextInt();}

        int count =0;
        for(int i = 0; i<n; i++){
            for(int j =i+1 ; j<n;j++){
            
            	if((ar[i]+ar[j]) %  key == 0){
                    count++;
                    System.out.println("{"+i +"" + j+"}");
                   
                    
                }
            	
            }
        }
        System.out.println(count);

	

	}
}
