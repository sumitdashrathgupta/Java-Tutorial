class largestnum
{
	public static void largest(int x, int y)
	{
	System.out.println(x > y ? x : y);
	}
	public static void largest(int x, int y, int z)
	{
	System.out.println(x > y ? (x > y ? x : y) : (y > z ? y : z));
	}
	public static void largest(int w, int x,int y,int z)
	{
	System.out.println(w > x ? (w > x ? w:x ):(y > z ? y:z));
	}
	public static void main(String[] args)
	{
	System.out.println("Start");
	 largest(1,3);
	largest(4,6,3);
	largest(4,6,3,9);
	}

}