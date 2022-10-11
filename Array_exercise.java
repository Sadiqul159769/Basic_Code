package basic;

import java.util.Scanner;

public class Array_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int x=sc.nextInt();
		
		int [] array= new int[size];
		
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			if(x==array[i]) {
			System.out.print(array[i]+" is the index of " + i);
			}
			
		}

	}

}
