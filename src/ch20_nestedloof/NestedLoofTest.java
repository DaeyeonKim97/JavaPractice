package ch20_nestedloof;

public class NestedLoofTest {

	public static void main(String[] args) {
		int dan = 2;
		int count = 1;
		
		for(; dan<=9; dan++) {
			for(count = 1; count <=9; count ++) {
				System.out.println(dan + "x" + count + "=" + dan*count);
			}
		}

	}

}
