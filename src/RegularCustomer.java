public class RegularCustomer extend Customer {
	public RegularCustomer(String name, double amount) {
		
		super(name, amount);
	}
	
	@OverRide
	public double calculateBill(){
		return this.getAmount();
	}
}
