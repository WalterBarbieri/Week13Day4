package entities;

public class app {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(-10, 20);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());

		Dog fido = new Dog("Fido", 4, "boxer");
		Cat fischietto = new Cat("Fischietto", 1, "Black");
		System.out.println(fido.toString());
		System.out.println(fischietto.toString());
		System.out.println(fido.name + " says: " + fido.bark() + "(" + fido.getInfo() + ", " + fido.walk() + " and "
				+ fido.eat() + ")");
		System.out.println(fischietto.name + " says: " + fischietto.meow() + "(" + fischietto.getInfo() + ", "
				+ fischietto.walk() + " and " + fischietto.eat() + ")");

		fido.run();
		fischietto.run();
		fischietto.jump();
	}

}
