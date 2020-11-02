package branch;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();

		if(number<10) {
		System.out.println("数字を入力してください");
		System.out.println(number);
		System.out.println("値: "+0+number);
		}
		if(number>=10) {
			System.out.println("数字を入力してください");
			System.out.println(number);
			System.out.println("値: "+number);
			sc.close();
		}

	}

}
