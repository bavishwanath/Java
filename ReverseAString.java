package basics;

public class ReverseAString {

	public static void main(String[] args) {

		// 1st approach: using StringBuffer / StringBuilder
		String s = "happy";
		StringBuffer sb1 = new StringBuffer();
		sb1.append(s);
		sb1.reverse();
		System.out.println("The string before reverse: " + s);
		System.out.println("The string after reverse: " + sb1);

		// 2nd approach:
		String input = "english";
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		System.out.println("The string before reverse: " + input);
		System.out.println("The string after reverse: " + output);
		
		
		String ip = "vishwa";
		String op = "";
		
		for(int i=ip.length()-1; i>=0; i--) {
			op = op+ip.charAt(i);
		}
	}

}
