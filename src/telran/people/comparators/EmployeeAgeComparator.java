package telran.people.comparators;

import java.util.Comparator;

import telran.people.Person;

public class EmployeeAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return Integer.compare(p2.getBirthYear(), p1.getBirthYear());
	}

}
