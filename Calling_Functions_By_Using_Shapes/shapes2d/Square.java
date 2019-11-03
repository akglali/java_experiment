package shapes2d;

public class Square {
	private int side;
	
	public Square(int side) {
		this.side=side;

	}
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int area() {
		return side*side;
	}

	public String toString() {
		return "Square [side=" + side + "]";
	}

}
