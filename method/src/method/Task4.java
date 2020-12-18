package method;

public class Task4 {
	public static void main(String[] args) {
		String[] array1 = {"a", "b", "c"};
		String[] array2 = {"a", null, "c"};

		boolean result1 = nullCheck1(array1);
		boolean result2 = nullCheck2(array2);

		System.out.println("---配列にnullがない場合---");
		System.out.println(result1);
		System.out.println("---配列にnullがある場合---");
		System.out.println(result2);
	}

	public static boolean nullCheck1(String[] array1){
		boolean containNull = false;
		for(int i = 0; i< array1.length; i++) {
			if(array1[i] == null) {
				containNull = true;
			}
		}
		return containNull;
	}
	public static boolean nullCheck2(String[] array2){

		boolean containNull= false;
		for(int i = 0; i< array2.length; i++) {
			if(array2[i] == null) {
				containNull = true;
			}
		}
		return containNull;
    }


}











