package ch08_constant_typecast;

public class TypeCast {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(iNum);
		
		iNum = 255;
		//bNum = iNum; //error : cannot convert from int to byte
		bNum = (byte)iNum; // explicit type casting
		
		System.out.println(bNum);
		
		double dNum = 3.14;
		int inum = (int)dNum; // less precise -> more precise need explicit casting 
		
		System.out.println(inum);
		
		

	}

}
