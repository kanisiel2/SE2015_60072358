import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HacksaMain {

	public static void main(String[] args) {
		
		//Professor professor = new Professor("choi");
		//Lecture lecture1 = new Lecture("소프트웨어 공학");
		
		//생성자로 빈을 가져와서 코드 내의 생성자를 없애버림.
		//메인클래스와 서브 클래스를 완벽하게 분리시킴
		ApplicationContext factory = new ClassPathXmlApplicationContext(
			new String[]{"applicationContext.xml"}
		);	
		
		Professor professor = (Professor)factory.getBean("professor");
		Lecture lecture2 = (Lecture)factory.getBean("lecture2");
		Student student = (Student)factory.getBean("student");
		Student student2 = (Student)factory.getBean("student2");
		
		professor.addLecture(lecture2);
		lecture2.addStudent(student);
		lecture2.addStudent(student2);
		professor.showLecture();
		
		
		
	}

}
