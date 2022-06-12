package oops;
import java.util.*;
import arithamatic.operations;
public class arithamatic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		operations ob=new operations();
		ob.add(a,b);
		ob.sub(a,b);
		ob.mul(a,b);
		ob.div(a,b);
		
		
	}

}
