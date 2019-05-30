package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s= new Student(1,"Shashank","ss359302@gmail");
		Student s2=new Student(2,"Rishav","Rishavgusain100@gmail.com");
		s.getRollNumber();
		System.out.println(s.getRollNumber());
		System.out.println(s.getName());
		System.out.println(s.getEmail());
		System.out.println(s2.getRollNumber());
		System.out.println(s2.getName());
		System.out.println(s2.getEmail());
		

	}

}
