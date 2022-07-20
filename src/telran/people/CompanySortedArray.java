package telran.people;

import java.util.Arrays;

public class CompanySortedArray extends CompanyArray {
	@Override 
	protected int getEmployeeIndex(long id) {
		
		Person key = new Person(id,0, null);
		Arrays.binarySearch(this.employees, key);
		return Arrays.binarySearch(this.employees, key);
		
	}
	@Override
	public boolean addEmployee(Employee empl) {
	int ind = getEmployeeIndex(empl.getId());
	if(ind >= 0) {
		return false;
	}
	ind = -(ind+1);
	Employee[] tmp = new Employee[employees.length + 1];	
	System.arraycopy(employees, 0, tmp, 0, ind);
	System.arraycopy(employees, ind, tmp, ind + 1, employees.length - ind);
	tmp[ind] = empl;
	employees = tmp;
	return true;
}
	@Override
	public Employee[] getAllEmployees() {
		return Arrays.copyOf(employees, employees.length);
	}
}
