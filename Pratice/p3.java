/*class p3{
	int a=15;
	public static void main(String[] args)
	{
	int a=12;
	p3 f1=new p3();
	System.out.println(a);
	System.out.println(f1); //Address
	System.out.println(f1.a);
	}
}*/

class p3{

	public void demo()
	{
	System.out.println("start demo");
	System.out.println(this);
	test(12,4);
	}

	public static void main(String[] args)
	{
	System.out.println("Start main()");
	p3 f2=new p3();
	f2.demo();
	System.out.println("ends main()");
	}

	public static void test(int x,int y)
	{
	System.out.println(x);
	System.out.println(y);
	System.out.println(x+y);
	}
}
