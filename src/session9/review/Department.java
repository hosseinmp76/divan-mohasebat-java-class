package session9.review;

public class Department {

	String name;

	Teacher[] teachers;

	public void addTeacher(Teacher t) {
		int len = this.teachers.length;
		Teacher[] temp = new Teacher[len + 1];

		for (int i = 0; i < len; i++) {
			temp[i] = this.teachers[i];
		}

		temp[len] = t;

		this.teachers = temp;
	}

}
