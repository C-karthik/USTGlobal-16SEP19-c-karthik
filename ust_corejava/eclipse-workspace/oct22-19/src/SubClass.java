public class SubClass extends SuperClass{
	
	String s = "Subclass variable";
	 
	 SubClass(){
		 super();
		 
		 System.out.println("sub class Constructor");
		  }
	 void subClassMethod() {
		 
		 super.superClassMethod();
		 
	 }
	
}