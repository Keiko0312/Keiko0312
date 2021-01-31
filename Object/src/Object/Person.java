package Object;

public class Person {
	private String name;
	private int age;
	static int wallet = 0;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	Person(int wallet){
		Person.wallet += wallet;
	}
}





