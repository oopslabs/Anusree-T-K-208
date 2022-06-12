package new123;
import java.util.*;
public class priorityqueue {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	PriorityQueue<String>pq=new PriorityQueue<>();
		System.out.println("Enter the limit:");
		int n;
		String str;
		n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a string:");
		for(int i=0;i<n;i++) {
				str=sc.nextLine();
		pq.add(str);
		}
		System.out.println("Peek data is : "+pq.peek());
		
		System.out.println("The data in prioriy queue is: "+pq);
		pq.poll();
		System.out.println("After polling the priorityqueue is:"+pq);
		
		


}
}
