package entities;

public class Dog extends Animal implements Runner {
	String breed;

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Animal -> Dog: [name: " + name + ", age: " + age + ", breed: " + breed + "]";
	}

	protected String bark() {
		return "Woof!";
	}

	@Override
	public String getInfo() {
		return "I'm a dog";

	}

	@Override
	public void run() {
		System.out.println("I " + name + " run all the time");

	}
}
