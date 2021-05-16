package basics;

public class FibonacciSeries {
	
	static int n1=0, n2=1, n3, i, count=20;

	public static void main(String[] args) {
		
		System.out.print(n1+","+n2);
		
		// 1st approach
		for(i=2; i<count; i++) {
			n3=n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
		}
		
		// 2nd approach: using recurssion
		printFibonacci(count-2);
	}
	
	public static void printFibonacci(int count) {
		
		if (count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(","+n3);
			printFibonacci(count-1);
		}
		
	}
}
