import java.util.ArrayList;


public class Professor {
	private String name;
	private Lecture lecture;
	
	public Professor(){
		
	}
	
	public Professor(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void addLecture(Lecture lecture) {
		this.lecture = lecture;
	}

	public void showLecture() {
		System.out.println("과목명 : "+lecture.getName());
		System.out.println("담당교수 : "+this.getName());
		ArrayList<Student> students = lecture.getStudents();
		for(int i = 0; i < students.size(); i++){
			System.out.println("학생 "+(i+1)+" : "+students.get(i).getName());
		}
	}
	
}
