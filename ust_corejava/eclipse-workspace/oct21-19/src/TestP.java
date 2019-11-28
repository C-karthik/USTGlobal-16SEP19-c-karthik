public class TestP {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.age = 21;
		p.name = "vijay";
		p.color = "black";
		System.out.println(p.color); // can do but not good practice
		System.out.println(p.age);
		System.out.println(p.name);
		
		System.out.println("============= static varibles and method=========");
		
		
		Person.color = "green";
		
		System.out.println(Person.color);
		Person.walk();
		System.out.println("==========obj2==========");
		
		Person p1 = new Person();
		p1.age = 21;
		p1.name = "vijay";
		p1.color = "yellow";
		System.out.println(p1.color); // can do but not good practice
		System.out.println(p1.age);
		System.out.println(p1.name);
		
		System.out.println("============= static varibles and method=========");
		
		
		Person.color = "fair";
		
		System.out.println(Person.color);
		Person.walk();
		
	}

}