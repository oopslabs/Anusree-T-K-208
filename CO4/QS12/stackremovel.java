package new123;
import java.util.*;
public class stackremovel {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Stack<String>sta=new Stack<>();
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		String str;
		sc.nextLine();
		System.out.println("Enter a String:");
		for(int i=0;i<n;i++)
		{
			str=sc.nextLine();
			sta.push(str);
		}
		System.out.println("The data are:"+sta);
		System.out.println("Enter the index to remove an element from stack");
		int in=-sc.nextInt();
		sta.remove(in);
		System.out.println("After removel the stack is:"+sta);
		
	}

}
