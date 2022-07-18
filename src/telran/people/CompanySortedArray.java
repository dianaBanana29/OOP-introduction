package telran.people;

import java.util.Arrays;

public class CompanySortedArray extends CompanyArray {
	@Override
public boolean addEmployee(Employee empl) {
	//TODO
		//finds index for adding with keeping array sorted
		//based on Arrays.BinarySearch!
	return false;
}
	private int getEmployeeIndex(long id) {
		//TODO
		//based on BinarySearch too
		return -1;
	}
	@Override
	public Employee[] getAllEmployees() {
		return Arrays.copyOf(employees, employees.length);
	}
}
