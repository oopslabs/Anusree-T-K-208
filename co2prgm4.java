//Program to create a class for Employee having attributes eNo, eName eSalary. Read n
//employ information and Search for an employee given eNo, using the concept of Array of
//Objects. 
package program;
import java.util.*;
public class Employee {
	int eno,sal,n;
	String ename;
	Scanner sc=new Scanner(System.in);
	void read()
	{
		System.out.println("Enter the employee number:");
		eno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the employee name:");
		ename=sc.nextLine();
		System.out.println("Enter the employee salary:");
		sal=sc.nextInt();
	}
	void disp()
	{
		System.out.println("\nThe eno of employee is: "+eno+"\nThe employee name is :"+ename+"\nThe salary of a employee is:"+sal);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int flag=0;
		System.out.println("Enter the number of a employee:");
		int n=sc.nextInt();
		Employee e[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			e[i]=new Employee();
			e[i].read();
		}
		System.out.println("*** The details if a employee is ***");
		for(int i=0;i<n;i++)
		{
			e[i].disp();
		}
		System.out.println("Enter the employeenumber to be searched:");
		int m=sc.nextInt();
		for(int i=0;i<n;i++){
		if(e[i].eno==m)
			{
			flag=1;
			System.out.println("\nThe eno of employee is: "+e[i].eno+"\nThe employee name is :"+e[i].ename+"\nThe salary of a employee is:"+e[i].sal);
			}
		}
		if(flag==0)
		{
			System.out.println("Not found");
		}
	}
}
