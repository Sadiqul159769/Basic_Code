package basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int temp=x;
        int reverse=0;
        while(temp>10){
            
            int lastdigit= temp/10;
            reverse= reverse*10+lastdigit;
            temp= temp/10; 
        }
        if(x==reverse){
            System.out.println("true");
            }
        else
        {
            System.out.println("false");
        }
    }
}

