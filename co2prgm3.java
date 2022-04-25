//Add complex numbers
package program;
import java.util.*;
public class Comlex {
	int real,img,real1,img1,real2,img2;
		Scanner sc=new Scanner(System.in);
		void read()
		{
			System.out.println("Enter the real part of first complex number:");
			real=sc.nextInt();
			System.out.println("Enter the imaginary part first complex number:");
			img=sc.nextInt();
			System.out.println("Enter the real part of second complex number:");
			real1=sc.nextInt();
			System.out.println("Enter the imaginary part second complex number:");
			img1=sc.nextInt();
		}
		void sum()
		{
			 real2=real+real1;
			 img2=img+img1;
		}
		void disp()
		{
			System.out.println("The first complex number is:"+real+"+"+img+"i");
			System.out.println("The second complex number is:"+real1+"+"+img1+"i");
			System.out.println("The sum of two complex number is:"+real2+"+"+img2+"i");
		}
		public static void main(String args[]){ 
			Comlex ob=new Comlex();
			ob.read();
			ob.sum();
			ob.disp();
			
		}
	}
