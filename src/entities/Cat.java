package entities;

public class Cat extends Animal implements Runner, Jumper {
	String colour;

	public Cat(String name, int age, String colour) {
		super(name, age);
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Animal -> Cat: [name: " + name + ", age: " + age + ", colour: " + colour + "]";
	}

	protected String meow() {
		return "Meow!";
	}

	@Override
	public String getInfo() {
		return "I'm a cat";

	}

	@Override
	public void run() {
		System.out.println("I " + name + " run all the time");

	}

	@Override
	public void jump() {
		System.out.println("I " + name + " jump all the time");
	}
}
