package variable;

public class Task3 {
	public static void main(String[] args){
		int intNum=216;
		double doubleNum=346.2;
		long longNum=123456L;
		System.out.println("変換前");
		System.out.println(intNum);
		System.out.println(doubleNum);
		System.out.println(longNum);

		long number1=intNum;
		float number2=(float)doubleNum;
		double number3=longNum;
		System.out.println("変換後");
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
	}

}
