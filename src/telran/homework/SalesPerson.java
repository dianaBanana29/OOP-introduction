package telran.homework;

public class SalesPerson extends Employee {
	private int sales;
	private int percentPay;
	public SalesPerson(long id, int birthYear, String email, int basicSalary, int sales, int percentPay) {
		super(id, birthYear, email, basicSalary);
		setSales(sales);
		setPercentPay(percentPay);
	}
	
	public void setSales(int sales) {
		this.sales = sales;
	}
	
	public void setPercentPay(int percentPay) {
		this.percentPay = percentPay;
	}

@Override
public double computePay() {
	return super.computePay() + Math.round(sales/100*percentPay);
}
}
