public class TestSC {
	
	final void add() {
		System.out.println("add");
	}
	final void add(int a) {
		System.out.println("add(int a) method");
	}
	
	
	
	public static void main(String[] args) {

		SuperClass sup = new SuperClass();

		sup.superClassMethod();

		System.out.println("------getting from super class proporties also -------------");

		SubClass sub = new SubClass();

		sub.subClassMethod();
		
		TestSC sc = new TestSC();
		sc.add();
		sc.add(10);
	}
}
