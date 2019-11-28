public class Emp2 {
	int id;
	String name;
	Emp2(int id , String name){
		this.id = id;
		name = name;
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {

		Emp2 e = new Emp2(121,"akshitha");
		e.display();
		Emp2 e1 = new Emp2(333,"ammulu");
		e1.display();
		Emp2 e2 = new Emp2(141,"avanthi");
		e2.display();

	}
}
