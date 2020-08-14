
public class MInPlus {

	public static void main(String[] args) {


		int arr[]= {1,2,3,-1,-2,-3,0,0};
		
		 int n;
		 float pos=0,neg=0,zero=0;
	        n=arr.length;
	        int i=0;
	        while(n>0){
	            if(arr[i]>0){
	                pos++;
	            }else if(arr[i]<0){
	                neg++;
	                
	            }else{
	                zero++;
	            }
	            i++;
	            n--;
	        }
	        
	        System.out.println(pos/arr.length);
	        System.out.println(neg/arr.length);
	        System.out.println(zero/arr.length);

	}

}
