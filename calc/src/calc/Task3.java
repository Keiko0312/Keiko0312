package calc;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();


		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println("合計: "+(number1+number2+number3));
		System.out.println("平均(3で割った時): "+((number1+number2+number3)/3));
		System.out.println("平均(3.0で割った時): "+((number1+number2+number3)/3.0));
		sc.close();

	}

}
