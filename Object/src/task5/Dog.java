package task5;

public class Dog extends Animal{
		static String name;
		static int age;
		static double weight;

	    Dog( String name , int age, double weight) {
			this.name = name;
			this.age = age;
			this. weight = weight;
		}
	    public void run(){
			System.out.println(name + "は走った");
		}

		public void sleep(){
			System.out.println(name + "は眠った");
		}

	}





