package session9.review;

public class App {
	public static void main(String[] args) {
		Department d = new Department();

		Teacher t1 = new Teacher("r");

		Teacher t2 = new Teacher("d");

		Student s1 = new Student("ed", t1);
		Student s2 = new Student("33fr", t2);

		d.teachers = new Teacher[2];
		d.teachers[0] = t1;
		d.teachers[1] = t2;

		Teacher t3 = new Teacher("t");
		d.addTeacher(t3);

		Teacher t4 = new Teacher("t");
		d.addTeacher(t4);
	}
}
