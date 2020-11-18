package loop;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("数字を入力してください: " + number);
		int keta=0;
		while(0 < number) {
			number /= 10;
			keta++;
		}
		System.out.println("桁数: " + keta);
		sc.close();
	}
}
