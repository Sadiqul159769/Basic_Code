package basic;

import java.util.Scanner;

public class Diamond_loop {
	
	public static void main(String args[]) {
		
		System.out.println("Enter how many input you want: ");
	
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		
		for(int i=1; i<=input; i++) {
			for (int j=input ; j>i ; j--)
			{
				System.out.print(" ");
				
			}
			for(int k=i;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int k=3;k<=i;k++)
			{
				for(int l=k; l<=k;l++) {
					System.out.print(" ");
				}
			}
			for(int k=2; k <=i;k++) {
				for(int l=i; l<=k;l++) {
					System.out.print("*");
				}
				
			}
			System.out.println();
			
		}				
	}

}
