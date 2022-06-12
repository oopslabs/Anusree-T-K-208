package new123;
import java.util.*;
public class linkedlistremovel {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String>ll=new LinkedList<>();
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		String str;
		sc.nextLine();
		System.out.println("Enter a String:");
		for(int i=0;i<n;i++)
		{
			str=sc.nextLine();
			ll.add(str);
		}
		System.out.println("The data are:"+ll);
		System.out.println("Remove all element from linkedlist we use clear method.....");
		ll.clear();
		System.out.println("After removel the linkedlist is:"+ll);
}
}
