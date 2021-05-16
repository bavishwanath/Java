package basics;

import java.nio.charset.Charset;
import java.util.Random;

public class GenerateRandomString {

	public static void main(String[] args) {
		
		int n = 5;
		
		byte[] array = new byte[256];
		
		new Random().nextBytes(array);
		
		String randomString = new String(array, Charset.forName("UTF-8"));
		
		StringBuffer result = new StringBuffer();
		
		String alphaNumericString = randomString.replaceAll("[^A-Za-z0-9]", "");
		
		for (int k=0; k<alphaNumericString.length(); k++) {
			
			if(Character.isLetter(alphaNumericString.charAt(k)) && ( n >0)  || Character.isDigit(alphaNumericString.charAt(k))  ) {
				result.append(alphaNumericString.charAt(k));
				n--;
			}
		}
		
		String response = result.toString();
		
		System.out.println(response);
		
		System.out.println(10+20+"name"+10+20);

	}

}
