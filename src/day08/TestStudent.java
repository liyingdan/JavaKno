package day08;

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		s.info();
		System.out.println(s.getName() + ":" + s.getAge());
		
		Student s1 = new Student("����ϣ����ѧ");
		System.out.println(s1.getName() + ":" + s1.getAge() + "," + s1.getSchoolName());
	
		System.out.println(Person.class.getSuperclass().getName());
	}
}
