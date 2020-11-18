package array;

public class Task2 {
	public static void main(String[] args) {
		int[] array = new int[7];
		int j = 7;
		int k =1;
		//7,6,5,4,3,2,1を表示
		for(int i = 0; i < array.length; i++) {
			array[i] = j;
			j--;
			if(i < array.length - 1) {
				System.out.print(array[i] + ",");
			}else if(i == array.length - 1) {
				System.out.print(array[i] );
			}
		}
		System.out.println();
		//1,2,3,4,5,6,7を表示
		for(int i = 0; i < array.length; i++) {
			array[i] = k;
			k++;
			if(i < array.length - 1) {
				System.out.print(array[i] + ",");
			}else if(i == array.length - 1) {
				System.out.print(array[i] );
			}
		}
	}
}

