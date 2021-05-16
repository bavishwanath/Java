package sortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] sample = {5,7,1,3,9,4};
		for(int i=0; i>=sample.length-1; i++) {
			System.out.println(sample[i]);
		}
		
		int temp;
		
		System.out.println(sample);
		
		boolean sorted = false;
		
		while(!sorted) {
			sorted = true;
			for (int i = 0; i<=sample.length-1; i++) {
				if (sample[i] > sample[i+1]) {
					temp = sample[i];
					sample[i] = sample[i+1];
					sample[i+1] = sample[i];
					sorted = false;
				}
			}
		}
		
		for(int i=0; i<=sample.length-1; i++) {
			System.out.println(sample[i]);
		}
			
		
		

	}

}
