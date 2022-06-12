package new123;
import java.util.*;
public class co4q10 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String>fruits=new ArrayList<>();
		int ch;
		String str;
		System.out.println("MENU\n1.ADD\n2.REMOVE\n3.DISPLAY\n0.EXIT\n");
		do {
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			sc.nextLine();
			switch(ch) {
			case 1:System.out.println("enter the fruit name");
			       str=sc.nextLine();
			       fruits.add(str);
			       break;
			case 2:System.out.println("Enter the index to remove an element");
			        int ind=sc.nextInt();
			        fruits.remove(ind);
			        break;
			case 3:System.out.println("The elements are"+fruits);
			     break;
			       
			default:System.out.println("invalid");
			        
			}
		}while(ch!=4);
	}

}
