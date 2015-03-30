import java.util.ArrayList;


public class Lecture {
	private String name;
	private ArrayList<Student> students;
	
	public Lecture() {
	}

	public Lecture(String name) {
		this.name = name;
		this.students = new ArrayList<Student>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}
	
}
