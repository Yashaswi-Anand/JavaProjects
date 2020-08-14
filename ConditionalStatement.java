import java.util.Scanner;

//Objective
//In this challenge, we're getting started with conditional statements. Check out the Tutorial tab for learning materials and an instructional video!
//
//Task
//Given an integer, , perform the following conditional actions:
//
//If  is odd, print Weird
//If  is even and in the inclusive range of  to , print Not Weird
//If  is even and in the inclusive range of  to , print Weird
//If  is even and greater than , print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.
//
//Input Format
//
//A single line containing a positive integer, .
//
//Constraints
//
//Output Format
//
//Print Weird if the number is weird; otherwise, print Not Weird.
//
//Sample Input 0
//
//3
//Sample Output 0
//
//Weird
//Sample Input 1
//
//24
//Sample Output 1
//
//Not Weird
//Explanation
//Sample Case 0: n=3
//n is odd and odd numbers are weird, so we print Weird.
//
//Sample Case 1: n=24
//n>20 and  is even, so it isn't weird. Thus, we print Not Weird.
public class ConditionalStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N % 2 == 0){
            if(N>=2 && N<=5)
            	System.out.println("Not Werid.");
            else if( N>=6 && N<=20) 
            	System.out.println("Werid.");
            else 
            	System.out.println("Not Werid.");   
        }else{
            System.out.println("Werid.");
        }

        sc.close(); 
        
	}

}
