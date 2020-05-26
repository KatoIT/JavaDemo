package chap01.introdue;

public class p02_variable {
	public static void main2(String[] args) {
		int age,year;//		khai bao bien kieu du lieu 'int'-(so nguyen)
		char name,city;//		khai bao bien kieu du lieu 'char'-(ky tu)
/*		char firtname //normal
		char firtName // CemalCase nen su dung 
*/	
		final int YOUR_BIRTHDAY = 2000;
		age 	= 20;
		name 	= 'A';
		year 	= 2019;
		city 	= 'H';
		System.out.println("Name: " + name);
		System.out.println("Birthday: " + YOUR_BIRTHDAY);
		System.out.println("Age: " + age);
		System.out.println("year: " + year);
		System.out.println("City: " + city);
	}
	public static void main(String[] args) {
		int var1 = 10000;
		byte var2 = 100;
		char var3 = 'A';
		double var4 = 24.5;
		String var5 = "Nguyen Van An"; 
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
	}
}
