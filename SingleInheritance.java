package Assign_5;

public class SingleInheritance {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		rec.set_value(10,10);
		tri.set_value(10, 10);
		
		System.out.println("Area of Rectangle"+rec.area());
		System.out.println("Area of triangle"+tri.area());
	}

}
