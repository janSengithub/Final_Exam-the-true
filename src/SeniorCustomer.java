public class SeniorCustomer extend Customer {
	private static final double Discount =0.20;
	
	
	public SeniorCustomer(String name, double amount){
		super (name, amount);
	}
	
	@OverRide
	public double calculateBill(){
		return this.getAmount() - (this.getAmount () * Discount);
	}
}
