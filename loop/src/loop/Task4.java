package loop;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("正の整数を入力してください: " + number);
		System.out.print(number + "の約数: ");
		for(int i = 1; i <= number; i++){
			if(number % i == 0){
				if(i<number) {
					System.out.print(i + ",");
				}else if(i == number) {
					System.out.print(i);
				}
		    }
		}
		sc.close();
	}
}




