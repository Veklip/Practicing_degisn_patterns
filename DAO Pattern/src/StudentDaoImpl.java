import java.util.ArrayList;
import java.util.List;


public class StudentDaoImpl implements StudentDao {

	 List<Student> students;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	public StudentDaoImpl() {
		// TODO Auto-generated constructor stub
		students = new ArrayList<Student>();
		Student student1 = new Student("Robert",0);
		Student student2 = new Student("John",1);
		students.add(student1);
		students.add(student2);		
	}

	@Override
	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() 
				+", updated in the database");
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() 
				+", deleted from database");
	}

}
