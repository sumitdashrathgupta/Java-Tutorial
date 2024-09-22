class cal	
{
	public static void main(String[] args)
	{
		int num1=2;
		int num2=4;
		System.out.println("If you press 1 than perform Addition");
		System.out.println("If you press 2 than perform Subtraction");
		System.out.println("If you press 3 than perform Multiplication");
		System.out.println("If you press 4 than perform Division");
		char Press = 'S';
		
		switch(Press)
		{	
			case '+':
			System.out.println(num1+num2);
			break;

			case '-':
			System.out.println(num1-num2);
			break;

			case '*':
			System.out.println(num1*num2);
			break;

			case '/':
			System.out.println(num1/num2);
			break;
			
			default:
			System.out.println("Invald");
		}
	}	

}