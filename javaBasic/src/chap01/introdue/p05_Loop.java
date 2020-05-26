package chap01.introdue;

import java.util.Scanner;

public class p05_Loop {
	public static void main(String[] args) {
		//in ra n bang cuu chuong tu a -> b
		Scanner sc = new Scanner(System.in);
		System.out.println("You want to print the multiplication table from the table: ");
		int var1 = sc.nextInt();
		System.out.println("To: ");
		int var2 = sc.nextInt();
		sc.close();
		int result = 0;
		for(int k=var1; k<=var2; k++)
		{
			System.out.println("\nMultiplication table "+k+":");
			for(int i=0; i<=10; i++)
			{
				result = i*k;
				System.out.println(k+" x "+i+" = "+ result);//Way 1
//				System.out.printf("%d x %d = %d\n",k,i,result); //Way 2
			}
		}
	}
	public static void main2(String[] args) {
		// in ra 1 bang cuu chuong
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multiplication you want to print: ");
		int var1 = sc.nextInt();
		int result = 0;
		sc.close();
		//For
		for(int i=0; i<=10; i++)
		{
			result = i*var1;
			System.out.println(var1+" x "+i+" = "+ result);//Way 1
//			System.out.printf("%d x %d = %d\n",var1,i,result); //Way 2
		}
/*		//While
		int j=0;
		while(j<=10)
		{
			result = j*var1;
			System.out.println(var1+" x "+j+" = "+ result);
			j++;
		}
		//Do...While
		int k=0;
		do
		{
			result = k*var1;
			System.out.println(var1+" x "+k+" = "+ result);
			k++;
		}while(k<=10);
		*/
	}
	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text you want to print: ");
		String var1 = sc.nextLine();
		System.out.println("Enter the number of times you want to print: ");
		int var2 = sc.nextInt();
		sc.close();
		//Loop For
		System.out.println("Loop For");
		for(int i=0;i<var2;i++) System.out.println((i+1)+"---"+var1);
		//Loop While
		System.out.println("Loop While");
		int j=0;
		while(j<var2)
		{
			System.out.println((j+1)+"---"+var1);
			j++;
		}
		//Loop Do...While
		System.out.println("Loop Do...While");
		int k=0;
		do {
			System.out.println((k+1)+"---"+var1);
			k++;
		}while(k<var2);
	}
}
