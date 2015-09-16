
public class StudentController {
	private StudentView view;
	private Student model;

	public StudentController(Student model, StudentView view){
		this.model = model;
		this.view = view;

	}
	
	public void updateView(){
		view.printStudentDetail(model.getName(),model.getRollNo());
	}
	
	public void setStudentName(String name){
		model.setName(name);
	}
	
	public void setStudentRoll(String roll){
		model.setRollNo(roll);
	}
}
