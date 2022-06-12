package new123;
import java.util.*;
public class Doubleendedqueue {
	public static void main(String args[]) {
	Deque<String> dq1=new LinkedList<>(); 
	dq1.add("Hello");
	dq1.addFirst("Welcome");
	dq1.addLast("Hai");
	dq1.push("language");
	dq1.offer("Java");
	System.out.println("Deque"+dq1+"");
	System.out.println("Removing First element");
	dq1.removeFirst();
	System.out.println("After removel "+dq1);
	dq1.removeLast();
	System.out.println("After removing last element"+dq1);
	
	
	

}
}
