public class Student {
	int id;
	int sem ;
	String name;
	String branch;
	String cllg;
	
	Student(int id, String name , String branch, String cllg , int year){
		
		this.id = id;
		this.name = name ;
		this.branch = branch;
		this.cllg = cllg;
		sem = year;

	}
	
	void display() {
		System.out.print(id + " ");
		System.out.print(name + " ");
		System.out.print(branch + " ");
		System.out.print(cllg + " ");
		System.out.println(sem);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new  Student(121 , "karthik" , "eee" , "svu" , 1);		
		s1.display();
		Student s2 = new  Student(122 , "manju" , "ece" , "kpm" , 2);
		s2.display();
		Student s3 = new  Student(123 , "deepti" , "ece" , "svu" , 3);
		s3.display();
		Student s4 = new  Student(124 , "vishnu" , "ece" , "mysore c e" , 5);
		s4.display();
		Student s5 = new  Student(125 , "sanvi" , "eee" , "jntua" , 6);
		s5.display();
		Student s6 = new  Student(126 , "viji" , "eee" , "jntucek" , 7);
		s6.display();
		Student s7 = new  Student(127 , "dora" , "mech" , "reva" , 8);
		s7.display();
		Student s8 = new  Student(128 , "mahesh" , "eee" , "jntucek" , 4);
		s8.display();
		Student s9 = new  Student(129 , "manoj" , "civil" , "mits" , 6);
		s9.display();
		Student s10 = new  Student(130 , "vinodh" , "cse" , "svcet" , 4);
		s10.display();
	}
	
	
	
	
	
	
	
	
}
