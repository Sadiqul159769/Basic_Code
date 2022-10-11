package basic;

import java.util.*;
public class prime_number {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
//		int num= sc.nextInt();
//		int rev=0;
//		while(num!=0) {
//			rev= rev*10+num%10;
//			num=num/10;
//		}
//		System.out.println("The reverse number is: "+rev);
		
//		String str= "abcd";
//		String rev= "";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			rev= rev+str.charAt(i);
//		}
//		System.out.print(rev);
		
		int n=200;
		int count =0;
		int prime=0;
		int number = 0;
		for(int i=100;i<=n;i++) {
			if(primenumber(i)) {
				System.out.println(i);
				count++;
				
			}
		}
		System.out.println(count);
	}

	private static boolean primenumber(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
}
