package p1;

public class p2 {
	
	 static int a=3;
	public void test() {
		System.out.println("Hello");
		System.out.println(a);
	}
	
	static
	{
		System.out.println("EER");	
	}
	
	static
	{
		System.out.println("EER");	
	}
	
	{
		System.out.println("Jay fine");
	}
	
	
	public static void main(String[] args) {
		int a=12;
		p2 obj=new p2();
		System.out.println(a);
		System.out.println(p2.a);
		System.out.println(obj.a);
		obj.test();
	}
	
	{
		System.out.println("Jay fine");
	}
	
}
