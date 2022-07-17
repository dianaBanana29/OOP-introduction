package telran.homework;

public class Employee extends Person{
	private int basicSalary;
	public Employee(long id, int birthYear, String email, int basicSalary) {
		super(id, birthYear, email);
		setBasicSalary(basicSalary);
		
	}
		
	private void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
		
	}
public double computePay() {
	return basicSalary;
}
}
