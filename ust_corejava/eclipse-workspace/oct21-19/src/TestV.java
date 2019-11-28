public class TestV {
	public static void main(String[] args) {
		
		Van v = new Van();
		v.cost = 5000000;
		v.color = "yellow";
		System.out.println("van cost = " + v.cost);
		System.out.println("van color = "+ v.color);
		
		v.move();
		
		Van v1 = new Van();
		
		v1.cost = 5000000;
		v1.color = "white";
		System.out.println("van cost = " + v1.cost);
		System.out.println("van color = "+ v1.color);
		
		
		v1.move();
				
		
	}
	
	
	

}
