package standardClass;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		String str = "ABCDGOPQRSYZ";
		Scanner sc=new Scanner(System.in);
     	String x = sc.nextLine();
     	System.out.println("探したい文字: " + x);

		if(str.indexOf(x) >= 0) {
			System.out.println(str + "は" + x + "を含む");
		}else {
			System.out.println(str + "は" + x + "を含まない");
		}
	}
}
