package ch03_variabletest;

public class VariableTest {
	public static void main(String[] args) {
		//byte bNum = 128; // error (Exceeding the range)
		byte bNum = 127;
		//int num = 12345678900 // error (out of range)
		//long lNum = 12345678900; // error (out of range)
		long lNum = 12345678900L;
		
		
		System.out.println(bNum);
		System.out.println(lNum);
	}
}
