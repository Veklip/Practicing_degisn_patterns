import java.util.ArrayList;
import java.util.List;


public class MaleCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> malePersons = new ArrayList<Person>();
		
		for(Person person : persons){
			if(person.getGender().equalsIgnoreCase("male"))
				malePersons.add(person);
		}
		
		return malePersons;
		
	}

}
