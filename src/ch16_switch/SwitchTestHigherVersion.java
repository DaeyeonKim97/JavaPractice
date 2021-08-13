package ch16_switch;

import java.util.Scanner;

public class SwitchTestHigherVersion {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day = switch(month) {
			case 1,3,5,7,8,10,12 ->{
				yield 31;
			}
			case 2 ->{
				yield 28;
			}
			case 4,6,9,11 ->{
				yield  30;
			}
			default ->{
				System.out.println("input error");
				yield -1;
			}
		};
		if (day != -1) {
			System.out.println(month + "'th month has "+ day + " days");
		}

	}

}
