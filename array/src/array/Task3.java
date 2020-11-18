package array;

import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] array = new int[6];

		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(9);
		}
		System.out.print("[");
		for(int i = 0; i < array.length; i++) {
			if(i < array.length - 1) {
				System.out.print(array[i] + ",");
			}else if (i == array.length - 1) {
				System.out.print(array[i] + "]");
			}
		}
		System.out.println();
		int intMax = array[0];
		int intMin = array[0];
		for(int i = 1; i < array.length; i++) {
			if(intMax < array[i]) {
				intMax = array[i];
			}
			if(intMin > array[i]) {
				intMin = array[i];
			}
		}
		System.out.println("最大値: " + intMax);
		System.out.println("最小値: " + intMin);
	}

}
