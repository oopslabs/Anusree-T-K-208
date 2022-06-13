package exam;
import java.util.*;
import java. math.*;
class rand extends Thread{
	Scanner sc=new Scanner(System.in);
	public rand()
	{
		System.out.print("Enter any number...");
	}
	public synchronized void run() {
	    System.out.println("To generate random numbers we use random function....");
	    try{
	    	Math.random();
	        Thread.sleep(1000);
	    }catch(Exception e)
	    {
	    	System.out.println("Exception "+e.getMessage());
	    }
	  
	  
	}
	
}
class even extends Thread{
	Scanner sc=new Scanner(System.in);
	int n,sq;
	public even() {
		System.out.println("Enter a number:");
		n=sc.nextInt();
		
	}
	public synchronized void run() {
		if(n%2==0) {
			System.out.println("The number is even.."+n);
			sq=n*n;
			System.out.println("The square of a number is :"+sq);
			
		}
		else
		{
			System.out.println("The number is odd so we cannot perform any operation....");
	}

	
}
}
	class odd extends Thread{
		Scanner sc=new Scanner(System.in);
		int n,cu;
		public odd() {
			System.out.println("Enter another number:");
			n=sc.nextInt();
			
			
		}
		public synchronized void run() {
			if(n%2!=0) {
				System.out.println("The number is odd.."+n);
				cu=n*n*n;
				System.out.println("The cube of a number is :"+cu);
				
			}
			else
			{
				System.out.println("The number is even so we cannot perform any operation..");
			
		}

		
	}
	}

public class threadpgm {
	public static void main(String args[]) { 
		rand ob=new rand();
		even ob1=new even();
		odd ob2=new odd();
		ob.start();
		ob1.start();
		ob2.start();
	}
		
	}


