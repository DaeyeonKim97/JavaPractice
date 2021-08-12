package ch14_ifelse;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		int age = 7;
		Scanner scanner = new Scanner(System.in);
		age = scanner.nextInt();
		
		if (age>=8) {
			System.out.println("student");
		}
		else {
			System.out.println("not student");
		}
		
	}

}
