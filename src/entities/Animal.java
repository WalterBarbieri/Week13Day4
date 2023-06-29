package entities;

public abstract class Animal {
	String name;
	int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	protected String walk() {
		return "I walk on 4 legs";
	}

	protected String eat() {
		return "I eat with my mouth";
	}

	abstract public String getInfo();

}
