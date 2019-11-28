public class Employee {
	String name;
	int eid;

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "sanvi";
		e1.eid = 121;
		Employee e2 = new Employee();
		e2.name = "kartik";
		e2.eid = 321;
		Employee e3 = new Employee();
		e3.name = "manasa";
		e3.eid = 224;

		System.out.println(e1.name);
		System.out.println(e2.name);
		System.out.println(e3.name);
		System.out.println(e1.eid);
		System.out.println(e2.eid);
		System.out.println(e3.eid);
		
	}
}
 