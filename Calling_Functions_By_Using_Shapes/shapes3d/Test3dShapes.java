package shapes3d;

public class Test3dShapes {

	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(5, 10);
		
		System.out.println(cylinder);
		System.out.println(cylinder.area());
		System.out.println(cylinder.volume());
		
		Cube cube = new Cube(8);
		
		System.out.println(cube);
		System.out.println(cube.area());
		System.out.println(cube.volume());
	}

}
