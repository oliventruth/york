
public class SpecialInterestAccount extends InterestAccount
{
	double monthlyPremiumRate;
	int numberOftrans;
	public SpecialInterestAccount(double balanceIn, double InterestRateIn, double monthlyPremiumRateIn)
	{
		super(balanceIn, InterestRateIn);
		monthlyPremiumRate = monthlyPremiumRateIn;
		numberOftrans = 0;
	}
	
	public double getMonthlyPremiumRate()
	{
		return monthlyPremiumRate;
	}
	
	public void setMonthlyPremiumRate(double monthlyPremiumRateIn)
	{
		monthlyPremiumRate = monthlyPremiumRateIn;
	}
	
	public void credit(double amount)
	{
		numberOftrans += 1;
		super.credit(amount);
	}
	
	public boolean debit(double amount)
	{
		numberOftrans += 1;
		return super.debit(amount);
	}
		
	public String toString()
	{
		return super.toString()+"monthlyPremiumRate: "+monthlyPremiumRate+" Transaction count: "+numberOftrans+".";
	}
	
	public void addMonthlyInterest()
	{
		if ( numberOftrans < 4 )
			super.credit(super.getBalance() * getMonthlyPremiumRate());
		else
			super.credit(super.getBalance() * getMonthlyInterestRate());
	}
	
	/* Methods used from Super Class:
	   (i) credit()
	   (ii) debit()
	   (iii) toString()
	   (iv) getBalance()
	   (v) addMonthlyInterest()
	 */
	
}
