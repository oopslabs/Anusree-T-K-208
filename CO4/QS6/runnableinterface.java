package new123;
import java.util.*;
	 class thread2 extends Thread {
		public  synchronized void run() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Multiplication table");
			for(int i=1;i<=10;i++) {
				System.out.println(i*5);
			}
			
		}

	}
	 class prime extends Thread {
		public  synchronized void run() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int m=sc.nextInt();
			int flag=0;
			int p=m/2;
			for(int i=2;i<=p;i++) {
				if(m%i==0)
					System.out.println("Not a prime number");
				flag=1;
			}
			if(flag==0)
				System.out.println(m+"Is a Prime number");
			}
		}
public class threadpgm{
		 public static void main(String args[]) {
			 thread2 ob1=new thread2();
			 prime ob2=new prime();
			 ob1.start();
			 ob2.start();
		 }
	 }
	


