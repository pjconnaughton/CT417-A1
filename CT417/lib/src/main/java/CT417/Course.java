package CT417;

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {
	private String courseName;
	private ArrayList<Student> students;
	private ArrayList<SingleModule> modules;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Course(String name) {
		courseName = name;
	}
	
	public void setStartDate(LocalDate start) {
		startDate = start;
	}
	
	public void setEndDate(LocalDate end) {
		endDate = end;
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void addModule(SingleModule m) {
		modules.add(m);
	}
}
