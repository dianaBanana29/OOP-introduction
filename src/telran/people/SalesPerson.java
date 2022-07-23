package telran.people;

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
		if(percentPay <= 0 || percentPay > 100) {
			throw new IllegalArgumentException(String.format
					("%d - wrong percent value, its must be in range 1-100", percentPay));
		}
		this.percentPay = percentPay;
	}

@Override
public int computePay() {
	return super.computePay() +(int) Math.round(sales/100.0*percentPay);
}
}
