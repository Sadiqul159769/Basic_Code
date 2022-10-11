package basic;

import java.util.Scanner;

public class max_num {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int array[]= new int[num];
		for (int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			if(array[0]<array[i]) {
				array[0]=array[i];
			}
			
		}
		System.out.println(array[0]);

	}

}
