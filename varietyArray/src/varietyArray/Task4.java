package varietyArray;

import java.util.ArrayList;
import java.util.HashMap;

public class Task4{
	public static void main(String[] args) {
		int[] array = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};
		ArrayList<Integer> oddNum = new ArrayList<>();
		ArrayList<Integer> evenNum = new ArrayList<>();

		for(int i =0; i < array.length; i++) {
			if(array[i] % 2 == 1) {
				oddNum.add(array[i]);
			}else {
				evenNum.add(array[i]);
			}
		}

		HashMap<String, ArrayList<Integer>> number = new HashMap<>();
		number.put("奇数: ", oddNum);
		number.put("偶数: ", evenNum);

		System.out.println(number);
	}

}
