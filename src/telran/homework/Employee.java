package telran.homework;

public class Employee extends Person{
	private int basicSalary;

	public Employee(long id, int birthYear, String email, int basicSalary, int computePay) {
		super(id, birthYear, email);
		setBasicSalary(basicSalary);
		setComputePay(basicSalary);
		
	}
	private void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
		
	}

	private void setComputePay(int basicSalary2) {
		setBasicSalary(basicSalary);
		
	}

	public int getComputePay() {
		
		return basicSalary;
	}


}
