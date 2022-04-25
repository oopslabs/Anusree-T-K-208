//. Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of
the class and find the product having the lowest price. 
package program;
import java.util.*;
public class Product {
	    int pcode,price;
	    String pname;
	    void read()
	    {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nenter the Pcode:");
		pcode=sc.nextInt();
		sc.nextLine();
		System.out.print("\nenter the Pname:");
		pname=sc.nextLine();
		System.out.print("\nenter the Price:");
		 price=sc.nextInt();
	    }
	    void disp()
	    {
	    	System.out.print("\nThe Pcode is :"+pcode);
	    	System.out.print("\nThe Pname is :"+pname);
	    	System.out.print("\nThe Price is :"+price);
	    }
		
		
		public static void main(String[] args){
			Product ob=new Product();
			ob.read();
			ob.disp();
			Product ob1=new Product();
			ob1.read();
			ob1.disp();
			Product ob2=new Product();
			ob2.read();
			ob2.disp();
			if((ob.price<ob1.price)&&(ob.price<ob2.price))
			{
				System.out.print("\n The product"+ob.pname+"has lowest price");
			}
			else if(ob1.price<ob2.price)
			{
				System.out.print("\n The product"+ob1.pname+"has lowest price");
				
			}
			else
			{
				System.out.print("\n The product"+ob2.pname+"\thas lowest price");
			}
}
}
