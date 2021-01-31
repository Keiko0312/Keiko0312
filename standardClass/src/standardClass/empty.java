package standardClass;

public class empty {
	public static void main(String[] args) {
		String str = "cat_mouse_mouse_cat_cat";
		String[] strArray = str.split("_");
		int countCat = 0;
		int countMouse = 0;

		for( int i = 0; i < strArray.length; i++) {
			if(strArray[i] == "cat") {
				countCat += 1;
		    }
		}
		System.out.println(strArray[4]);
		System.out.println(countCat);
	}


}
