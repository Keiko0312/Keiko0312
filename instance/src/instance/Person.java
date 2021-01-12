package instance;

public class Person {
	String name = "長谷川敬子";
	int age = 18;

	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}
