class p2{
	static int x=15;
	public static void test()
	{
	int a=12;
	System.out.println(a);
	//System.out.println(x);
	}
	public static void main(String[] args)
	{
	int b;
	b=34;
	System.out.println(b);
	test();
	//System.out.println(x);
	}
	static{
	System.out.println(x);
	}
}