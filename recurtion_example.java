package basic;

import java.util.Scanner;

public class recurtion_example {
	
	public static void SumofNumber( int n,int sum) {
		if(n==0) {
			sum=sum+n;
			System.out.print(sum);
			return;
		}
		System.out.println(n);
		sum=sum+n;
		SumofNumber(n-1,sum);
		
	}
	
	public static void main(String args[]) {	
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		SumofNumber(n, sum);
		
	}

}
