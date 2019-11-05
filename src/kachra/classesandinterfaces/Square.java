package kachra.classesandinterfaces;

public class Square implements Shape {

	@Override
	public void area() {
		System.out.println("you are in Square-area");
		
	}

	@Override
	public void surfaceArea() {
		
		System.out.println("you are in Square-surfaceArea");
	}

}
