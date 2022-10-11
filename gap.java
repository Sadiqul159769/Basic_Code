package basic;

import java.util.*;
public class gap {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		int i;
		for(i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			for(int j=2*(n-i);j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print("*");	
				}
			System.out.println();
		}
		

	}

}
