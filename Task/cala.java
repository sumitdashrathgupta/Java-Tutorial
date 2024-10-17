import java.util.Scanner;

public class cala {
	
	public static void add(int x ,int y) {
		System.out.println("The Sum Value " + (x+y));
	}
	
	public static void sub(int x ,int y) {
		System.out.println( "The sub Value " + (x-y));
	}
	
	public static void mul(int x ,int y) {
		System.out.println("The mul Value " + (x*y));
	}
	
	public static void div(int x ,int y) {
		System.out.println("The div Value "+ (x/y));
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner inputdata = new Scanner(System.in);
		System.out.println("Enter the first No :");
		int n1=inputdata.nextInt();
		System.out.println("Enter the Second No :");
		int n2=inputdata.nextInt();
		System.out.println("Chooes the parformation : ");
		System.out.println("1 . Addition ( + )");
		System.out.println("2 . Sub ( - )");
		System.out.println("3 . mul ( * )");
		System.out.println("4 . div ( / )");
		System.out.println("Enter the Second No :");
		int s1= inputdata.nextInt();
		
		switch(s1) {
		case 1:add(n1,n2);
		 break;
		case 2:sub(n1,n2);
		 break;
		case 3:mul(n1,n2);
		 break;
		case 4:div(n1,n2);
		 break;
		 default:
			 System.out.println("Givn number is not valid");
		}
	}
}
