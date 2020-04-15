package kachra.classesandinterfaces;

public class Rect implements Shape {

	@Override
	public void area() {
		System.out.println("you are in Rect-area");
		
	}

	@Override
	public void surfaceArea() {
		
		System.out.println("you are in Rect-surfaceArea");
	}

}
