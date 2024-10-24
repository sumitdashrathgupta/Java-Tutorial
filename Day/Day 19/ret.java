class ret{
	public static int add(int a,int b)
	{
	System.out.println("Start add");
	int c=a+b;
	System.out.println("End add");
	return c;
	}

	public static void main(String[] args)
	{
	System.out.println("Start main");
	int res1=add(2,4);
	int res2=add(4,6);
	System.out.println(res1>res2 ? res1:res2);
	System.out.println("End main");
	}
}