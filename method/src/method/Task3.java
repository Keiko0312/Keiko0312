package method;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word1 =sc.nextLine();
		String word2 =sc.nextLine();
		int integer1 = sc.nextInt();
		int integer2 = sc.nextInt();
		Double decimal1 = sc.nextDouble();
		Double decimal2 = sc.nextDouble();

		String result1 = add(word1,word2);
		int result2 = add(integer1,integer2);
		Double result3 = add(decimal1, decimal2);

		System.out.println("--①文字列だけの場合---");
		System.out.println(result1);
		System.out.println("---②整数だけの場合----");
		System.out.println(result2);
		System.out.println("---③少数だけの場合----");
		System.out.println(result3);

	}

	public static String add(String a, String b){
		String connect = a + b;
		return connect;
	}
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public static double add(double a, double b) {
		double sum = a + b;
		return sum;
	}



}




