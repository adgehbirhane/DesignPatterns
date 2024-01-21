
import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
	public static void main(String args[]) {
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("Belay", "Male", "Single"));
		persons.add(new Person("Linge", "Male", "Married"));
		
		persons.add(new Person("Abeba", "Female", "Single"));
		persons.add(new Person("Abebech", "Female", "Married"));
		
		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		
		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));
		
		System.out.println("Female: ");
		printPersons(female.meetCriteria(persons));
		
	}
	
	public static void printPersons(List<Person> persons) {
		for(Person person : persons) {
			System.out.println("Person: [ Name : " + person.getName()
			+ ", Gender : " + person.getGender()
			+ ", Marital Status : " + person.getMarital()
			+" ]");
		}
	}
	
}
