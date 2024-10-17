class p1{
	static int a=15;
	public static void test()
	{
	System.out.println("start");
	System.out.println(a);
	a=9;
	System.out.println("Ends");
	}
	public static void main(String[] args)
	{
	System.out.println("start main");
	System.out.println(a);
	a=17;
	test();
	System.out.println(a);
	System.out.println("Ends main");
	}
}