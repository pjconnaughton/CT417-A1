package CT417;

import java.util.ArrayList;

public class SingleModule {
	private String moduleName;
	private Lecturer lecturer;
	private ArrayList<Student> students;
	private ArrayList<Course> courses;
	
	public SingleModule(String moduleName, Lecturer lecturer) {
		this.moduleName = moduleName;
		this.lecturer = lecturer;
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
}
