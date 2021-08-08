package ch05_chartest;

public class CharacterTest {
	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		char han = '한';
		char ch = '\uD55C'; //unicode
		System.out.println(han);
		System.out.println(ch);
	}
}
