package basic;

import java.util.Scanner;

public class Selection_sort {
	
	public static void ssort(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] array= new int[n];
		
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<array.length-1;i++) {
			int smallest= i;
			for(int j=i+1;j<array.length;j++) {
				if(array[smallest]>array[j]) {
					smallest=j;
				}
			}
			int temp = array[smallest];
			array[smallest]=array[i];
			array[i]= temp;
		}
		ssort(array);
	}

}
