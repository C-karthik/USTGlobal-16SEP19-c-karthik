public class TestC {
	public static void main(String[] args) {
		Cow c = new Cow();
		c.cost = 50000;
		c.color = "white";
		System.out.println("cost of cow "+ c.cost);
		System.out.println("color of cow "+ c.color);

		c.eat();
		c.sleep();
		
		Cow c1 = new Cow();
		c1.cost = 50000;
		c1.color = "black";
		System.out.println("cost of cow "+ c1.cost);
		System.out.println("color of cow "+ c1.color);

		c1.eat();
		c1.sleep();
		
		
	}
	
	
}
