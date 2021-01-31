package standardClass;

public class Task5 {
	public static void main(String[] args) {
		String str = "cat_mouse_mouse_cat_cat";
		String[] strArray = str.split("_");

		int countCat = 0;
		int countMouse = 0;

		for( int i = 0; i < strArray.length; i++) {
			if("cat".equals(strArray[i])) {
				countCat += 1;
			}if("mouse".equals(strArray[i])) {
				countMouse += 1;
		    }
		}
		//System.out.println(countMouse);
		//System.out.println(countCat);


		if(countCat > countMouse) {
			System.out.println("catの方が多い");
		} else{
			System.out.println("mouseの方が多い");
		}

	}
}
