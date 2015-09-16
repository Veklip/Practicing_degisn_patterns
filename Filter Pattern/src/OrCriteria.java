import java.util.ArrayList;
import java.util.List;


public class OrCriteria implements Criteria {

	private Criteria criteria1;
	private Criteria criteria2;
	
	public OrCriteria(Criteria criteria1,Criteria criteria2){
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> list1 = criteria1.meetCriteria(persons);
		List<Person> list2 = criteria2.meetCriteria(persons);
		
	
		for(Person p : list2){
			if(!list1.contains(p)){
				list1.add(p);
			}
		}
		return list1;
	}

}
