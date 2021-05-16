package basics;


public class thePOI {

	public static void main(String[] args) {
		
		
		
		/*
		 * for(int i=2; i<=20; i++) {
		 * 
		 * 
		 * for (int j=i; j<i/2; j++) {
		 * 
		 * 
		 * 
		 * } }
		 */
		
		/*
		 * int a = 4;
		 * 
		 * for (int i=2; i<a; i++) { if(a%i==0) { System.out.println("not prime"); }
		 * else { System.out.println(" prime"); } }
		 * 
		 * try {
		 * 
		 * } catch (Exception e) {
		 * 
		 * } finally { System.out.println("finally block"); }
		 */
		
		/*
		 * int a =6, fact=1;
		 * 
		 * while(a!=0) { fact = fact *a; a--; }
		 * 
		 * System.out.println(fact);
		 */
		
		
		
		String s1= "AUTOMATION TESTING";
		String s2="";


		String[] arr = s1.split("\\s");

		for (int i=0; i<=arr.length-1; i++) {

			StringBuffer sbf = new StringBuffer(arr[i]);
			sbf.reverse();
			s2 = s2 + " "+sbf.toString();

		}

		System.out.println(s2);
		
		/*
		 * Wait wait = new WebdriverWait(30, driver);
		 * 
		 * wait.untilExpectedConditions(ElementToBeVisible(WebElement));
		 * 
		 * >>
		 * 
		 * UPDATE empl_ID empTable
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
}