package new123;
import java.util.*;
public class linkedhashset {
	public static void main(String args[]) {
		LinkedHashSet<String>lha=new LinkedHashSet<>();
		lha.add("one");
		lha.add("Two");
		lha.add("Three");
		lha.add("Four");
		System.out.println("Elements:"+lha);
		System.out.println("remove elements from hashset:");
		lha.remove("one");
		System.out.println("After removel"+lha);
		
	}

}
