package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task7 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.print("現在日時: " + cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH)+ 1 + "月");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "日");

		cal.add(Calendar.DAY_OF_MONTH, 7);

		System.out.print("１週間後: " + cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH)+ 1 + "月");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "日");

		cal.add(Calendar.DAY_OF_MONTH, -7);

		cal.add(Calendar.YEAR,1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日E曜日");
		System.out.print("1年後: ");
		System.out.println( sdf.format(cal.getTime()));




	}
}
