public class Demo {
	static int a;
	int c;
	
	Demo(){
		System.out.println(" constructor ");
	}
	
	static {
		a=10;
		System.out.println("STATIC 1");
	}
	
	public static void main(String[] args) {
		
		// int a = 10; local variable first preference
		Demo d =  new Demo();
		System.out.println(" a value is "+ a);
	}
	static {
		a = 40;
		System.out.println(" static 2");
	}

}
