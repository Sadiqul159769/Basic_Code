package basic;

import java.util.Scanner;

public class recurtion_factorial {
	
	public static void Factorial(int n, int fac) {
		if(n==1) {
			fac= fac+n;
			System.out.print(fac);
			return;
		}
		System.out.println(n);
		fac=fac+n;
		n=n*(n-1);
		Factorial(n,fac);
	}
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int fac=1;
		Factorial(n,fac);
		
	}

}
