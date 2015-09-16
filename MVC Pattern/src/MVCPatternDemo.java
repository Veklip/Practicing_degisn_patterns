
public class MVCPatternDemo {

	private static Student retriveStudentFromDatabase(){
		Student stu = new Student();
		stu.setName("jhon");
		stu.setRollNo("1");
		return stu;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student model = retriveStudentFromDatabase();
		
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model,view);
		
		controller.updateView();
		
		controller.setStudentName("kkk");
		controller.setStudentRoll("3");
		
		controller.updateView();
		
	}

}
