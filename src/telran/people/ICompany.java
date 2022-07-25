package telran.people;

import java.util.function.Predicate;

public interface ICompany {
boolean addEmployee(Employee empl);
Employee removeEmployee(long id);
Employee getEmployee(long id);
long computeSalaryBudget();
Employee[] getAllEmployees();
Employee[] sortEmployeesByAge();
Employee[] sortEmployeesBySalary();
Employee[] findEmployees(Predicate<Employee> predicate);
}
