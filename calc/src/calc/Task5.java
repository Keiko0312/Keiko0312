package calc;

import java.util.Scanner;


public class Task5 {
	public static void main(String[] args) {
		String name1="ノートPCの値段:";
		int price= 89800;
		char money='円';
		System.out.println(name1+price+money);
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println(str1);
		String str2=sc.nextLine();
		System.out.println(str2);
		System.out.println(str1+str2);
		sc.close();


	}

}