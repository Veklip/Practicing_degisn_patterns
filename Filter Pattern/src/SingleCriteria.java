import java.util.ArrayList;
import java.util.List;


public class SingleCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> singlePersons = new ArrayList<Person>();
		
		for(Person person : persons){
			if(person.getMaritalStatus().equalsIgnoreCase("single"))
				singlePersons.add(person);
		}
		
		return singlePersons;
	}

}
