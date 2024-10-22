package oops;

public class p1 {
	int a=13;
	public  void test() {
		int a=12;
		System.out.println("Test Start");
		System.out.println(a);
		System.out.println("Test End");
	}
	public static void main(String[] args) {
		System.out.println("Start main");
		p1 obj=new p1();
		obj.test();
		System.out.println(obj.a);
		System.out.println("Ends Main");
	}
}
