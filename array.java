package basic;
import java.util.*;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int i;
		int n;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("how many input you want: ");
		int size=sc.nextInt();
		int[] subject=new int[size];
		
		for(i=0;i<size;i++) {
			subject[i]=sc.nextInt();
		}
		
		for(i=0;i<size;i++) {
			System.out.print(subject[i]+" ");
		}
	}

}

