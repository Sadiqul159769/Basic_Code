package basic;

import java.util.Scanner;

public class Palindrome_loop {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		for(int k=i;k>1;k--)
		{
			System.out.print(k-1);
		}
		System.out.println();
	}
	}

	}


