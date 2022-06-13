package exam;
import java.util.*;
 class stack {
	  int top,n;
	  int a[]=new int[10];
 Scanner sc=new Scanner(System.in);
       void push() {
    	   Scanner sc=new Scanner(System.in);
    		System.out.print("Enter the size of the Stack:");
    		 n=sc.nextInt();
    		System.out.println("Enter element into stack:");
    	   for(int i=0;i<n;i++) {
    		 a[i]=sc.nextInt();
        	   if(top==n) {
        		   System.out.println("Stack is overflow....");
        	   }
        	   else
        	   {
        		   top++;
        		   a[top]=a[i];
        		   
        	   }
           }

			
		}
		void pop() {
			int m;
			if(top==-1)
			{
				System.out.println("There is no element in Stack is underflow..... ");
			}
			else {
				 System.out.println("Enter the  data item :");
				  m=sc.nextInt();
				  for( int i=0;i<=n;i++) {
	                          m=a[top];
	                    	  a[i]=a[top];
							  top--;
	                      }
	                      
					  }
					
			         
				}
			
			
			
			
		
		void disp() {
			System.out.println("The values in the stack are:");
			for(int i=0;i<n;i++) {
				System.out.println(a[i]);
			}
		}
 }	
public class stackop {
public static void main(String args[]) {
	stack st=new stack();
     Scanner sc=new Scanner(System.in);
	System.out.println("MENU\n1.PUSH\n2.POP\n3.Display\n4.Exit");
	int ch;
	do {
	System.out.println("Enter your choice:");
	
	ch=sc.nextInt();
	switch(ch) {
	case 1:st.push();
	       System.out.println("After pushing:\n");
	       st.disp();
	       break;
	case 2:st.pop();
			break;
	
	
	case 3:System.out.println("The elements are:");
	       st.disp();
	       break;
	default:System.out.println("INVALID...");
	}
	}while(ch!=4);
	
	}
}

