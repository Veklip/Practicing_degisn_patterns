import java.util.ArrayList;
import java.util.List;


public class FilterPatternDemo {

	public static void printPersons(List<Person> persons){
		for(Person p : persons){
			 System.out.println("Person: "+"[name="
					+p.getName()+",gender="+p.getGender()
					+",marial status="+p.getMaritalStatus()
					+"]");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      List<Person> persons = new ArrayList<Person>();

	      persons.add(new Person("Robert","Male", "Single"));
	      persons.add(new Person("John","Male", "Married"));
	      persons.add(new Person("Laura","Female", "Married"));
	      persons.add(new Person("Diana","Female", "Single"));
	      persons.add(new Person("Mike","Male", "Single"));
	      persons.add(new Person("Bobby","Male", "Single"));
	      
	      Criteria male = new MaleCriteria();
	      Criteria female = new FemaleCriteria();
	      Criteria single = new SingleCriteria();
	      Criteria singleMale = new AndCriteria(single, male);
	      Criteria singleOrFemale = new OrCriteria(single, female);
	      
	      System.out.println("Males: ");
	      printPersons(male.meetCriteria(persons));
	      
	      System.out.println("\nFemales: ");
	      printPersons(female.meetCriteria(persons));
	      
	      System.out.println("\nsingle Male: ");
	      printPersons(singleMale.meetCriteria(persons));
	      
	      System.out.println("\nsingle or Male: ");
	      printPersons(singleOrFemale.meetCriteria(persons));
	      
	}

}
