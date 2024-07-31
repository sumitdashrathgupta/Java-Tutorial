class simple{
	public static void main(String[] args)
{
	int a=3;
	int b=6;
	test(a,b);
	}
	public static void test(int a,int b)
	{
	a=++a;
	a=a++ + ++a;
	System.out.println(a);
	a+=b++;
	System.out.println(a);
}
	}