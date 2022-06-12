package arithamatic;
import java.util.*;
interface op{
		public void add(int x,int y);
		public void sub(int x,int y);
		public void mul(int x, int y);
		public void div(int x, int y);
	}
public class operations implements op {
	public void add(int x, int y) {
		System.out.println("Sum of two number is :"+(x+y));
	}
	public void sub(int x, int y) {
		System.out.println("Difference of two number is :"+(x-y));
	}
	public void mul(int x, int y) {
		System.out.println("Product of two number is :"+(x*y));
	}
	public void div(int x, int y) {
		System.out.println("Division of two number is :"+(x/y));
	}


}
