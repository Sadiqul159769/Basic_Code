package basic;

public class NewClass {
	
	int x= 5;
	int y= 6;
	public static void main(String[] args) {
		NewClass obj= new NewClass();
		obj.sum();
		obj.min();
		
		Second_child obj2= new Second_child();
		obj2.multiply();
		
		
		
		}
	
	public void sum(){
		int a= 5;
		int b= 6;
		int c= a+b;
		System.out.println(c);		
	}
	
	public void min() {
		int minus= x-y;
		System.out.println(minus);
	}

}
