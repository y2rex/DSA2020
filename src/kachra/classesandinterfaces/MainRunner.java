package kachra.classesandinterfaces;

public class MainRunner {

	public static void main(String[] args) {


		/*Shape sh=new Square();
		sh.area();
		sh.surfaceArea();*/
		
		
		Shape sh=new NotArea();
		sh.area();
		sh.surfaceArea();
		/*sh.kyu();
			here, you can't access kyu() method because 
			you stored NotArea in Shape.It means you
			can only access Shape properties not NotArea
			properties.*/
		
		/*Shape shape=null;
		shape.area();
		shape.surfaceArea();*/
		
		NotArea nt= new NotArea();
		nt.area();
		nt.surfaceArea();
		nt.kyu();

	}

}
