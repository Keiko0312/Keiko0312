package branch;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number<10) {
			System.out.println("10以上の数字を入れてください");
			System.out.println(number);
			System.out.println("値; "+number*10);
		}
		if(number>=10) {
			System.out.println("10以上の数字を入力してください");
			System.out.println(number);
			System.out.println("値: "+number);
			sc.close();
		}
	}

}
