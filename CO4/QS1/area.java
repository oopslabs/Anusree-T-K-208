package oop;
import java.util.*;
import graphics.shapes;
public class area {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of a rectangle: ");
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the side  of a square: ");
		int a=sc.nextInt();
		System.out.println("Enter the base and height of a triangle: ");
		float ba=sc.nextFloat();
		float h=sc.nextFloat();
		System.out.println("Enter the radius of a circle: ");
	    float r=sc.nextFloat();
	    shapes s=new shapes();
	    s.rectangle(l,b);
	    s.square(a);;
	    s.triangle(ba, h);;
	    s.circle(r);
		
		
	}
	

}

