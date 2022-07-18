package telran.people.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.people.*;

class CompanyTests {
private static final long ID1 = 1;
private static final int BIRTH_YEAR1 = 1980;
private static final String EMAIL1 = "empl1@gmail.com";
private static final int BASIC_SALARY = 1000;
private static final int WAGE = 100;
private static final int HOURS = 100;
private static final long ID2 = 2;
private static final int BIRTH_YEAR2 = 1970;
private static final String EMAL2 = "empl2@gmail.com";
private static final int SALES = 1000;
private static final int PERCENT_PAY = 10;
private static final long ID3 = 3;
private static final int BIRTH_YEAR3 = 2000;
private static final String EMAIL3 = "empl3@gmail.com";
private static final int HOURS2 = 10;
private static final int COMPANY_SIZE = 3;
private static 
ICompany company;
Employee empl1 = new WageEmployee(ID1, BIRTH_YEAR1, EMAIL1, BASIC_SALARY, WAGE, HOURS);
Employee empl2 = new SalesPerson(ID2, BIRTH_YEAR2, EMAL2, BASIC_SALARY, SALES, PERCENT_PAY);
Employee empl3 = new WageEmployee(ID3, BIRTH_YEAR3, EMAIL3, BASIC_SALARY, WAGE, HOURS2);
Employee[] employees = { 
		empl2, empl1, empl2		
};

@BeforeEach
void setUp() throws Exception {
	company = new CompanyArray();
	//TODO
	//company = new CompanyArraySorted();
	for (int i = 0; i < employees.length; i++) {
		company.addEmployee(employees[i]);
	}
}
	@Test
	void testAddEmployee() {
		long id = 1111111111;
		assertTrue(company.addEmployee(new Employee(id, 1980, EMAIL1, 1000)));
		assertFalse(company.addEmployee(new Employee(id, 1980, EMAIL1, 1000)));
	}

	@Test
	void testRemoveEmployee() {
	Employee empl = company.removeEmployee(ID1);
	assertNotNull(empl);
	assertEquals(ID1, empl.getId());
	empl = company.removeEmployee(ID1);
	assertNull(empl);
	assertTrue(company.addEmployee(empl1));
	}

	@Test
	void testGetEmployee() {
		Employee empl = company.getEmployee(ID1);
		assertEquals(empl.getId(), ID1);
		assertNotNull(empl);
		empl = company.getEmployee(1111111);
		assertNull(empl);
	}

	@Test
	void testComputeSalaryBudget() {
		assertEquals(11000 + 1100 + 2000, company.computeSalaryBudget() );
	}

	@Test
	void testGetAllEmployees() {
	Employee [] resultEmployees = company.getAllEmployees();
	assertEquals(ID1, resultEmployees[0].getId());
	assertEquals(ID2, resultEmployees[1].getId());
	assertEquals(ID3, resultEmployees[2].getId());
	assertEquals(COMPANY_SIZE, resultEmployees.length);
	}

}
