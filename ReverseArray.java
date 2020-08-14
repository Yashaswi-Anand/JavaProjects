import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
	
		int arr[]= {1,2,3,-1,-2,-3,0,0};
		
		System.out.println(arr.length);
		Arrays.sort(arr);
		
		for(int i = arr.length-1; i>=0;i--) {
			
			System.out.print(arr[i]+ " ");
		}

	}

}
