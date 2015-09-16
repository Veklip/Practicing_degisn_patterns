import java.util.List;


public class AndCriteria implements Criteria {

	private Criteria criteria1;
	private Criteria criteria2;
	
	public AndCriteria(Criteria criteria1,Criteria criteria2){
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		return criteria2.meetCriteria(criteria1.meetCriteria(persons));
	}

}
