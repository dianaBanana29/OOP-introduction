package telran.homework;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class HomeWorkTests {
@Test
void employeeTest() {
	Employee Walter = new Employee(123, 1975, "walterwhite@gmail.com", 8000);
	assertEquals(Walter.computePay(), 8000);
	assertEquals(Walter.getEmail(), "walterwhite@gmail.com");
}
@Test
void wageEmloyeeTest() {
	WageEmployee Jessie = new WageEmployee(124, 1991, "jessiepinkman@gmail.com", 7000, 30, 100);
	assertEquals(Jessie.computePay(), 10000);
}
@Test
void salesPersonTest() {
	SalesPerson Skyler = new SalesPerson(125, 1980, "skylerwhite@gmail.com", 10000, 20000, 10);
	assertEquals(Skyler.computePay(), 12000);
}

}
