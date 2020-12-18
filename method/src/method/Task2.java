package method;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double bottom =sc.nextDouble();
		double height =sc.nextDouble();
		double result = getTriangleArea(bottom,height);
		System.out.println("三角形の面積");
		System.out.println(result);
	}
	public static double getTriangleArea(double a, double b ) {
		double area =(a * b)/2;
		area = Math.round(area);
		return area;

	}

}
