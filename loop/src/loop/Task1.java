package loop;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("数字を入力してください: " + number);
		int sum = 0;
		for(int i = 0; i <= number; i++) {
			sum += i;
		}
		System.out.println("1～" + number + "までの合計: " + sum);
		sc.close();
		}
	}


