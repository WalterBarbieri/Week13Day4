package entities;

public class Rectangle {
	private double width, height;

	public Rectangle(double width, double height) {
		this.setWidth(width);
		this.setHeight(height);
	}

	public double getArea() {
		return this.getHeight() * this.getWidth();
	}

	public double getPerimeter() {
		return (this.getHeight() + this.getWidth()) * 2;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height <= 0)
			System.out.println("L'altezza deve essere sempre maggiore di zero");
		else
			this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width <= 0)
			System.out.println("La larghezza deve essere sempre maggiore di zero");
		else
			this.width = width;
	}

}
