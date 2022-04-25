//Search an element in an array. 
package program;
import java.util.*;
public class Array {
	public static void main(String args[]){ 
		int a[]=new int[10];
		int m,i,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		m=sc.nextInt();
		System.out.println("Enter the elements in the Array:");
		for(i=0;i<m;i++){
			 a[i]=sc.nextInt();
		}
        System.out.println("Enter the element to be searched:");
        s=sc.nextInt();
        for(i=0;i<m;i++){
        	if(a[i]==s)
        	{
        		int index=i;
        		System.out.println("item found and the value is "+s+" and its position is "+i);
        		break;
        	}
        }
        	if(a[i]!=s)
        {
        	System.out.println("item not found");
        }
       
}
}
