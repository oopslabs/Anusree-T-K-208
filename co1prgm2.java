//Read 2 matrices from the console and perform matrix addition. 
package program;
import java.util.*;
public class Matrix {
	public static void main(String args[]){ 
		int a[][]=new int[10][10];
		int b[][]=new int[10][10],m,n,i,j;
		int c[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the first matrix:");
		m=sc.nextInt();
		System.out.println("Enter the elements in the first matrix:");
		for(i=0;i<m;i++){
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println(" \nThe elements in the first matrix is:");
		for(i=0;i<m;i++){
			for(j=0;j<m;j++)
			{
		System.out.print(a[i][j]+"\t");
		
			}
			System.out.println();
		}
		
		System.out.println("Enter the size of the Second matrix:");
		n=sc.nextInt();
		System.out.println("Enter the elements in the Second matrix:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
			{
				b[i][j]=sc.nextInt();
				
			}
		}
		System.out.println(" \nThe elements in the Second matrix is:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
			{
		System.out.print(b[i][j]+"\t");
		
			}
			System.out.println();
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("\nThe sum of the matrix is ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		
}
}
