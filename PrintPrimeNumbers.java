package basics;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to check if the number is prime or not ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		boolean isPrime = false;
		
		if(n<2) {
			isPrime = false;
		} else if (n==2) {
			isPrime = true;
		} else if (n>2) {
			for (int i=2; i<n; i++) {
				if(n%i==0) {
					isPrime = false;
				} else {
					isPrime = true;
				}
			}
		}
		
		if(isPrime) {
			System.out.println(n+" is a PRIME NUMBER");
		} else {
			System.out.println(n+" is NOT a PRIME NUMBER");
		}
	}
}
