public class Main {
	
	public static void main(String[] args) {
		
		Point p = new Point(3, 5); 
		Point p2 = new Point(6,6);
		
		p2.yCoord=7;
	
		Rectangle r = new Rectangle(7, 9 , p2);

		
		System.out.println("Area= " + r.area());
		
		Rectangle r2 = new Rectangle(10, 12, p2);
		
		System.out.println("Perimeter= "+ r.perimeter());
		
		Point[] corners = r2.corners();
		
		for (int i = 0 ; i < corners.length ; i++) {
			System.out.println("x = " +corners[i].xCoord + " y = " + corners[i].yCoord);
		}
		
		Circle c = new Circle(8, new Point(5, 5));
		
		Circle c1 = new Circle(5, new Point(10, 10));
		
		System.out.println("Area = "+ c.area());
		
		System.out.println("Perimeter = " + c.perimeter());
		
		System.out.println("Overlap= "+ c.overlap(c1));
		}
}


