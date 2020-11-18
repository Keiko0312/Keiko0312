package branch;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		String Rome="x";
		switch(number) {
			case 1:
				Rome="Ⅰ";
				break;
			case 2:
				Rome="Ⅱ";
				break;
			case 3:
				Rome="Ⅲ";
				break;
			case 4:
				Rome="Ⅳ";
				break;
			case 5:
				Rome="Ⅴ";
				break;
			default:
				Rome="unknown";
				break;
		}
		System.out.println("1から5までの数字を入力してください");
		System.out.println(number);
		System.out.println(number+ " -> "+Rome);
		sc.close();
	}
}



























