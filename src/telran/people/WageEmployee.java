package telran.people;

public class WageEmployee extends Employee{
	private int wage;
	private int hours;
public WageEmployee(long id, int birthYear, String email, int basicSalary, int wage, int hours) {
		super(id, birthYear, email, basicSalary);
		setWage(wage);
		setHours(hours);
	}
private void setHours(int hours) {
	this.hours = hours;
		
}
private void setWage(int wage) {
	this.wage = wage;
}
@Override
public int computePay() {
	return super.computePay() + wage * hours;
}
}
