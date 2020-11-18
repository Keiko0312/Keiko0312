package loop;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("数字を入力してください: " + number);
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum += i;
			if(i < number) {
			    System.out.print(i + " + ");
		    }else if(i == number) {
		    	System.out.print(i + " = " + sum);
		    }
		 }
		sc.close();
	}
}
