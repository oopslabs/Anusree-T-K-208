package graphics;
interface figures
{
 public void rectangle (int l, int b);
 public void square(int a);
 public void triangle(float ba,float h);
 void circle(float r);
 }
public class shapes implements figures{
	public void rectangle(int l,int b)
	{
		System.out.println("Area of a rectangle is: "+(l*b));
	}
	public void square(int a)
	{
		System.out.println("Area of a square is: "+(a*a));
	}
	
	public void triangle(float ba,float h)
	{
		System.out.println("Area of a triangle is: "+(0.5*ba*h));
	}
	
	public void circle(float r)
	{
		System.out.println("Area of a Circle is: "+(3.14*r*r));
	}
	
}
