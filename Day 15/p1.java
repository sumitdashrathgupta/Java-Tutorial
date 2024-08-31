class p1{
	public static void main(String[] args)
	{
	int pre =55;
	if(pre>=90 && pre<=100)
	{
	System.out.println(pre+" Gread A");
	}
	else if(pre>=80 && pre<=89)
	{
	System.out.println(pre+" Gread B");
	}
	else if(pre>=70 && pre<=79)
	{
	System.out.println(pre+" Gread C");
	}
	else if(pre>=60 && pre<=69)
	{
	System.out.println(pre+" Gread D");
	}
	else if(pre>=0 && pre<=59)
	{
	System.out.println(pre+" Fal");
	}
	else
	{
	System.out.println("This percentage is "+ pre +" Invaid");
	}
}
}