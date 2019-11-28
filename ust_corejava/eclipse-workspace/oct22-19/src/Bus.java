public class Bus {
	int seats;
	String color;

	Bus(int s , String c) {         // finally here
		this.color = c;
		this .seats = s;
	}
	Bus() {
		this(40);                // first comes here 
	}
	Bus(int s){
		this(s,"yellow");        // then here
	}

	// this is a keyword used to call one constructor by another constructor in same class

	public static void main(String[] args) {

		Bus b = new Bus();
		Bus b1 = new Bus(50 , "red");
		System.out.println("Wlecome to " + b.color +  " bus seats capacity " + b.seats);
     
		System.out.println(b1.color + " ------- " + b1.seats); // directly goes to first constructor

	}

}
