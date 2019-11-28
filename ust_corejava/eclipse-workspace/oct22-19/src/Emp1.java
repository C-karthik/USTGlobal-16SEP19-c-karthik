public class Emp1 {
	int id;
	String name;
	Emp1(int i , String s){
		id = i;
		name = s;
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {

		Emp1 e = new Emp1(121,"arvindha");
		e.display();
		Emp1 e1 = new Emp1(333,"alakya");
		e1.display();
		Emp1 e2 = new Emp1(141,"ankitha");
		e2.display();

	}
}
