//Read a matrix from the console and check whether it is symmetric or not. 
package program;
import java.util.*;
public class Symmetricmatrix {
	public static void main(String args[]){ 
		int a[][]=new int[10][10];
		int b[][]=new int[10][10],m,i,j,count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the  matrix:");
		m=sc.nextInt();
		System.out.println("Enter the elements in the matrix:");
		for(i=0;i<m;i++){
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("The Matrix is:");
		for(i=0;i<m;i++){
			for(j=0;j<m;j++)
			{
				System.out.print(a[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		for (i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				b[i][j]=a[j][i];
				
			}
		}	
		for (i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
       if(a[i][j]!=b[i][j])
       {
    	   count++;
    	   break;
       }
		    }
       }
		if(count==1)
		{
			System.out.println("The matrix is symmtric");
		}
		else
		{
			System.out.println("The matrix is not symmtric");
		}
}
}
