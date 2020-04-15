package week5.stack.implementation.usingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementation {

	public static void main(String[] args) {

		Queue<Integer> q= new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.add(5);
		System.out.println(q);

	}

}
