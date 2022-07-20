package telran.people;

import java.util.Arrays;

public class CompanySortedArray extends CompanyArray {
	@Override 
	protected int getEmployeeIndex(long id) {
		
		Person key = new Person(id,0, null);
		int res = Arrays.binarySearch(this.employees, key);
		return res;
		
	}
	@Override
	public boolean addEmployee(Employee empl) {
	int ind = getEmployeeIndex(empl.getId());
	if(ind >= 0) {
		return false;
	}
	ind = -ind;
	Employee[] tmp = new Employee[employees.length + 1];	
	System.arraycopy(employees, 0, tmp, 0, ind -1);
	System.arraycopy(employees, ind-1, tmp, ind, employees.length - (ind-1));
	tmp[ind-1] = empl;
	employees = tmp;
	return true;
}
	@Override
	public Employee[] getAllEmployees() {
		return Arrays.copyOf(employees, employees.length);
	}
}
