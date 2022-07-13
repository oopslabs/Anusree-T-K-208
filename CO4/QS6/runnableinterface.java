package new123;
import java.util.*;
class even implements Runnable{ 
	int n,m;
	even()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting limit");
		 m=sc.nextInt();
		System.out.println("enter the Ending limit");
		n=sc.nextInt();
	}
	public synchronized void run() {
		
		
		
		for(int i=m;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
class fibnocci implements Runnable{
	int limit;
	fibnocci()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the range");
	limit=sc.nextInt();
	
	
	}
	public synchronized void run() {
	int i;
	int f0=0,f1=1,fn;
	for(i=0;i<limit;i++)
	{
		System.out.println(f0);
		fn=f0+f1;
		f0=f1;
		f1=fn;
		
	}
	
}
}
public class threadpgm2{
	public static void main(String args[]) {
		even ob=new even();
		Thread t1=new Thread(ob);
		t1.start();
		fibnocci ob1=new fibnocci();
		Thread t2=new Thread(ob1);
		t2.start();
	}
	
}
