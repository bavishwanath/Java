package index;

import java.util.Scanner;

public class AngryProffesor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to angry prof world");
		System.out.println("please enter the total strength. of the class...");
		int totalStrength = scan.nextInt();
		int attendance[] = new int[totalStrength];
		System.out.println("please enter the min strength of the class...");
		int minimumStrength = scan.nextInt();
		System.out.println("please enter today's attendence of the class...");
		for(int i=0; i<totalStrength; i++) {
			attendance[i] = scan.nextInt();
		}
		String isThereAnyClassToday = isThereAnyClassToday(attendance,totalStrength,minimumStrength);
		System.out.println("Class is cancelled...? : "+isThereAnyClassToday);
	}
	
	private static String isThereAnyClassToday(int attendance[], int totalStrength, int minimumStrength) {
		int studentsOnTime=0;
		for(int i=0; i<attendance.length; i++) {
			if(attendance[i]<=0) {
				studentsOnTime++;
			}
		}
		if(studentsOnTime >= minimumStrength) {
			return "NO";
		} else {
			return "YES";
		}
	}



}
