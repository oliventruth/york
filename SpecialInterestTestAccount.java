
public class SpecialInterestTestAccount 
{
	public static void main(String[] args)
	{
		SpecialInterestAccount sa1 = new SpecialInterestAccount(5000, 0.15, 0.24);
		sa1.addMonthlyInterest();
		System.out.println(sa1.toString());
		sa1.debit(1000);
		sa1.credit(5000);
		sa1.addMonthlyInterest();
		System.out.println(sa1.toString());
		sa1.debit(1000);
		sa1.debit(4000);
		sa1.credit(5000);
		sa1.addMonthlyInterest();
		System.out.println(sa1.toString());		
	}

}
