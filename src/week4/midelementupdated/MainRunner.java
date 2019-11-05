package week4.midelementupdated;

public class MainRunner {

	public static void main(String[] args) {

		LinkedList l=new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		
		l.show();
		System.out.println();
		System.out.println("================================");
		System.out.println(l.length());
		System.out.println("================================");
		l.showMid();

	}

}
