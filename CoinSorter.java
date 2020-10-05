import java.util.*;

public class CoinSorter 
{
	
	private String currency;
	private int minCoinIn;
	private int maxCoinIn;
	private int totalCoinValue;
	private int excludedCoin;
	private List<Integer> coinList;
	
	CoinSorter(String currencyIn, int minCoinValIn, int maxCoinValIn, List<Integer> coinListIn)
	{
		currency = currencyIn;
		minCoinIn = minCoinValIn;
		maxCoinIn = maxCoinValIn;
		coinList = coinListIn;
	}
	
	CoinSorter()
	{
		currency = "Pound Sterling";
		minCoinIn = 0;
		maxCoinIn = 10000;
		coinList = new ArrayList<Integer>();
		coinList.add(200);
		coinList.add(100);
		coinList.add(50);
		coinList.add(20);
		coinList.add(10);
	}

	
	public void setCurrency(String currencyIn)
	{
		currency = currencyIn;
	}
	
	public void setMinCoinIn(int minCoinValIn)
	{
		minCoinIn = minCoinValIn;
	}
	
	public void setMaxCoinIn(int maxCoinValIn)
	{
		maxCoinIn = maxCoinValIn;
	}
	
	public void setTotalCoinValue(int totalCoinValueIn)
	{
		totalCoinValue = totalCoinValueIn;
	}
	
	public void setExcludedCoin(int excludedCoinIn)
	{
		excludedCoin = excludedCoinIn;
	}
	
	public int getExcludedCoin()
	{
		return excludedCoin;
	}
	
	public int getTotalCoinValue()
	{
		return totalCoinValue;
	}
	
	public String getCurrency()
	{
		return currency;
	}
	
	public int getMinCoinIn() 
	{
		return minCoinIn;
	}
	
	public int getMaxCoinIn()
	{
		return maxCoinIn;
	}
	
	public String printCoinList()
	{
		String message = "";
		for (int i = 0; i < coinList.size(); i++ )
		{
			if ( i != coinList.size()-1 )
				message = message.concat(coinList.get(i)+", ");
			else
				message = message.concat(coinList.get(i)+".");
		}
		return "The current coin denominations are in circulation: "+message;
	}
	
	public void validateExcludedCoin()
	{
		boolean isNotValid = true;
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.print("Please enter either (i) Coin type or (ii) Coin type to Exclude: ");
			// NOTE* excludedCoinIn variable is used for both use-cases, since it is checking existence of Coin type
			// if the coin type does not exist, it can neither compute maximum number of coins, nor can be excluded.
			int excludedCoinIn = sc.nextInt();
			if ( coinList.contains(excludedCoinIn) )
			{
				setExcludedCoin(excludedCoinIn);
				isNotValid = false;
			}
			else
				System.out.println("The coin type does not exist.");
		} while ( isNotValid );		
	}
	
	public void validateTotalValue()
	{
		boolean isNotValid = true;
		int totalCoinValueIn;
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.print("Please enter the Total Value: ");
			totalCoinValueIn = sc.nextInt();
			if ( totalCoinValueIn >= minCoinIn && totalCoinValueIn <= maxCoinIn)
			{
				setTotalCoinValue(totalCoinValueIn);
				isNotValid = false;
			}
			else
				System.out.println("The Total Value you have entered is not valid.");
		} while ( isNotValid );	
	}
	
	public String coinCalculator(int totalVal, int coinType)
	{
		int factor = totalVal / coinType;
		int remainder = totalVal % coinType;
		return "A total of "+factor+" x "+coinType+"p coins can be exchanged, with a remainder of "+remainder+"p.";
	}
	public String multiCoinCalculator(int totalVal, int coinTypeExclude)
	{
		String message = "";
		int factor;
		int remainder = 0;
		for ( int i = 0; i < coinList.size(); i++ )
		{
			if ( coinList.get(i) != coinTypeExclude )
			{
				factor = totalVal / coinList.get(i);
				message = message.concat(factor+" x "+coinList.get(i)+"p,");
				totalVal -= factor * coinList.get(i);
			}	
			else
			{
				factor = 0;
				message = message.concat(factor+" x "+coinList.get(i)+"p,");
				totalVal -= factor * coinList.get(i);
			}
			
			if ( i == coinList.size() - 1 )
				remainder = totalVal%coinList.get(i);
		}
		return "The coins exchanged are: "+message+" with a remainder of "+remainder+"p.";
	}
	
	public String displayProgramConfigs()
	{
		return "Currency is "+getCurrency()+", Maximum is "+getMaxCoinIn()+", Minimum is "+getMinCoinIn()+".";
	}

}
