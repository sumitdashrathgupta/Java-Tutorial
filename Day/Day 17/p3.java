class p3{
	static int a=12;
	public static void test()
	{
	System.out.println(a);
	a=5;
	System.out.println(a);
	}
	public static void main(String[] args)
	{
	System.out.println(a);
	a=8;
	test();
	System.out.println(a);
	}
}