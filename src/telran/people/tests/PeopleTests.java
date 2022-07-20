package telran.people.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import telran.people.Employee;
import telran.people.SalesPerson;

public class PeopleTests {
@Test
void employeeTest() {
	Employee walter = new Employee(123, 1975, "walterwhite@gmail.com", 8000);
	assertEquals(walter.computePay(), 8000);
	assertEquals(walter.getEmail(), "walterwhite@gmail.com");
}

@Test
void salesPersonTest() {
	SalesPerson skyler = new SalesPerson(125, 1980, "skylerwhite@gmail.com", 10000, 20000, 10);
	assertEquals(skyler.computePay(), 12000);
}

}
 