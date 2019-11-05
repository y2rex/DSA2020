package kachra.classesandinterfaces;

public class NotArea implements Shape {

	@Override
	public void area() {
		System.out.println("You are in NotArea-area");

	}

	@Override
	public void surfaceArea() {
		System.out.println("You are in NotArea-surfaceArea");
	}
	
	public NotArea() {
		System.out.println("NotArea constructor calling....");

	}
	public void kyu()
	{
		System.out.println("kyu called....");
	}

}
