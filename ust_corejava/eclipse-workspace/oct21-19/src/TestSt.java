public class TestSt {
	public static void main(String[] args) {
		Student.collname = "TestYentra";
		Student s = new Student();
		s.name = "chandu";
		s.usn = 121;
		System.out.println("colage is "+ Student.collname);
		System.out.println("student name = "+ s.name);
		System.out.println("id is "+s.usn);
		
		s.read();

	}
}
