package varietyArray;

import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<String>name = new ArrayList<>();
		name.add("北海道");
		name.add("東北");
		name.add("関東");
		name.add("中部");
		name.add("近畿");
		name.add("中国");
		name.add("九州");

		for(String location : name){
			System.out.println(location);
		}

	}

}
