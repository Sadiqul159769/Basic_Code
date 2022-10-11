package basic;

import java.util.Scanner;

public class Bubblesort_Array {
	
	
	public static void printArray(int array[]) {
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] array= new int[n];
		
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}
		}
		printArray(array);
	}

}
