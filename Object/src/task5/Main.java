package task5;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("ポチ", 5,12.3);
		Animal animal = new Animal();

		System.out.println("名前: " + Dog.name );
		System.out.println("年齢: " + Dog.age + "歳");
		System.out.println("体重: " + Dog.weight + "kg");

		dog.run();
		animal.sleep();
		dog.sleep();

	}


}
