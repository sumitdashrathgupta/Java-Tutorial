class p1
{	int a=13;
	public void demo()
	{
	int a=12;
	System.out.println("Start Demo()");
	System.out.println(a);
	System.out.println("Ends Demo()");
	}
	public static void main(String[] args)
	{
	static int a=13;
	System.out.println("Start Main()");
	p1 obj=new p1();
	obj.demo();
	System.out.println("Ends main()");
	}
}