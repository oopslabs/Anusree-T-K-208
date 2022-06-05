package oops;

	public class Results implements Student,Sports{
		
		void display(){	
			System.out.println("Name: "+name+"\nMark for Java: "+java+"\nMark for Sports: "+sm);
		}
		
		public static void main(String[] args){
			Results obj=new Results();
			obj.display();
				
		}
	}

	interface Student{	
		String name="Anju";
		int java=100;
		
	}


	interface Sports{
		int sm=30;
		

	}


