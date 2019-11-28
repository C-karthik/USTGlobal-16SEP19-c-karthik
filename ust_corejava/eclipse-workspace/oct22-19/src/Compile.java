public class Compile {
	 Compile(){
		 System.out.println("executes only by object creation");
	 }
	final void add() {
		System.out.println("carryon its ok"); 
	}
	final void add(int a) {
		
		System.out.println("we can overload");
		
	}
	public static void main(String[] args) {
		
		//Compile c = new Compile() ;
			//c.add();
			//c.add(10);
		
	}

}
