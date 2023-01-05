
public class Main
{
	public static void main(String[] args)
	{
		Customer c =  new RegularCustomer ("Simon", 100);
		RegularCustomer rc = new RegularCustomer("Victor", 200);
		SeniorCustomer sc = new SeniorCustomer("Luis", 300);
		
		
		
		// initialize the Customer object to RegularCustomer object
		
		c = rc;
		System.out.println( " Bill for regular customer: " + c.calculateBill());
		
		
		// initialize Customer to SeniorCustomer
		
		c =sc;
		System.out.println( "Bill for senior customer: " + c. calculateBill());
		   
		}
   }
