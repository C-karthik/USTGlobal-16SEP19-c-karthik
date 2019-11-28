public class Demo1 {
	static int b;
	int a;
	{
		 b = 10;
		 a = 20;
		System.out.println("frst non static");
	}
	
	Demo1(){
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main starts");
		Demo1 d1 = new Demo1();
		System.out.println("non static value so called by obj ref = " +d1.a + "  ;  sataic variable "+ b);
	}
	
	{
		b = 30;
	int	c = 80;
		System.out.println("non static 2 ");
	}
}
 