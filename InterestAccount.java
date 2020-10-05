
public class InterestAccount extends Account
{
	double monthlyInterestRate;
	
	public InterestAccount (double balanceIn, double InterestRateIn)
	{
		super(balanceIn);
		monthlyInterestRate = InterestRateIn;
	}
	
	public void setMonthlyInterestRate( double monthlyInterestRateIn )
	{
		monthlyInterestRate = monthlyInterestRateIn;
	}
	
	public double getMonthlyInterestRate()
	{
		return monthlyInterestRate;
	}
	
	public void addMonthlyInterest()
	{
		super.credit(super.getBalance() * getMonthlyInterestRate());
	}
	
	public String toString()
	{
		return super.toString() + " Balance is: "+super.getBalance() + "; monthlyInterestRate is: "+getMonthlyInterestRate()+".";
	}
		
}
