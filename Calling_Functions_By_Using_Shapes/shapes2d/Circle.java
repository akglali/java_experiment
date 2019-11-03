package shapes2d;

public class Circle {
	
	private int radius;
	
	public Circle(int radius) {
		this.radius= radius;
	}
	
	public double area() {
		return  Math.PI * radius*radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}


	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
