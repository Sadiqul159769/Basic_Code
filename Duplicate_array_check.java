package basic;

import java.util.Scanner;


public class Duplicate_array_check {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Please input Array size : ");
		int n= sc.nextInt();
		int[] array= new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.print("The Duplicate number is: "+array[j]);
				}
				
			}
				
		}

	}

}
