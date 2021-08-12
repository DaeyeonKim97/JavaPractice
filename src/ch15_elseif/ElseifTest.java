package ch15_elseif;

import java.util.Scanner;

public class ElseifTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int charge;
		
		if(age<8) {
			charge = 1000;
			System.out.println("baby");
		}
		else if(age<14) {
			charge = 2000;
			System.out.println("elementary student");
		}
		else if(age<20) {
			charge = 2500;
			System.out.println("student");
		}
		else {
			charge = 3000;
			System.out.println("adult");
		}
		
		System.out.println("The charge is.. "+charge);

	}

}
