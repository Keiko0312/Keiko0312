package standardClass;

public class Task3 {
	public static void main(String[] args) {
		String str = "ABCDEFG";
		System.out.println("文字列: " + str);
		String x = "";

		for(int i = str.length(); i > 0; --i) {
			x = x + str.charAt(i-1);
		}

		System.out.println(x + ": 列字文");

	}


}


