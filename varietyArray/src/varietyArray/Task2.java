package varietyArray;

import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args) {
		int[] array = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
		ArrayList<Integer> oddNum = new ArrayList<>();
		ArrayList<Integer> evenNum = new ArrayList<>();

		for(int i =0; i < array.length; i++) {
			if(array[i] % 2 == 1) {
				oddNum.add(array[i]);
			}else {
				evenNum.add(array[i]);
			}
		}
			System.out.print("奇数: " + oddNum);
			System.out.println();
			System.out.print("偶数: " + evenNum);
	}
}
