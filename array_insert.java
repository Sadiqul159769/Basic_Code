package basic;

public class array_insert {
	
	public static void main(String[]args) {
		int n=4;
		int array[]= {1,2,3,4,5};
		System.out.print("Before Print:");
		for( int i = 0;i<n;i++) {
			System.out.print(" ");
			System.out.print(array[i]);
		}
		
		int pos=3;
		int value=10;
		for(int i=n-1;i>=pos;i--) {
			array[i+1]=array[i];
		}
		array[pos]= value;
		n=n+1;
		System.out.println();
		System.out.print("After Print:");
		for( int i = 0;i<n;i++) {
			System.out.print(" ");
			System.out.print(array[i]);
		}
			
	}	
}
