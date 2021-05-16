package basics;

public class CheckPrimeNumber {

	public static void main(String[] args) {

		int n = 6;
		
		int flag =0; 
		
		if(n==0 || n==1) {
			System.out.println("Number "+n+" is NOT PRIME");
		} else {
			for (int i=2; i<=n/2; i++) {
				if(n%i==0) {
					System.out.println("Number "+n+" is NOT PRIME");
					flag =1;
					break;
				} 
			}
		}
		
		if(flag==0) {
			System.out.println("Number "+n+" is PRIME");
		}

	}

}
