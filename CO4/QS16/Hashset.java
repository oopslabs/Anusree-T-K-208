package new123;
import java.util.*;
public class Hashsetcompare {
	public static void main(String args[]) {
		HashSet<Integer>ha=new HashSet<>();
		ha.add(10);
		ha.add(20);
		ha.add(40);
		ha.add(40);
		HashSet<Integer>ha1=new HashSet<>();
		ha1.add(25);
		ha1.add(45);
		ha1.add(50);
		System.out.println("Compare two hashsets and return a boolean value...\n"+ha.equals(ha1));
		
	}

}
