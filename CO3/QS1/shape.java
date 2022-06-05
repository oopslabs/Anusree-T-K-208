package oops;

public class shape {
	void area(double radius)
    {
        System.out.println("area of the circle is " + (3.14*radius*radius));
    }

    void area(int l,int b)
    {
        System.out.println("area of the rectangle is " + (l*b));
    }

    void area(int length)
    {
        System.out.println("area of the square is " + (length*length));
    }
    public static void main(String args[])
    {
    shape obj = new shape();
    obj.area(20.0);
    obj.area(10,20);
    obj.area(10);
    }
}




