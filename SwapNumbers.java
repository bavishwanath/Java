package basics;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 13;
		
		System.out.println("Before swapping");
		
		
		System.out.println(a);
		System.out.println(b);
		
		a = a + b; //18
		b = a-b;
		a= a-b;
		
		System.out.println("After swapping");
		
		System.out.println(a);
		System.out.println(b);
		

	}

}
