import java.util.*;

public class TestCoinSorter 
{
	
	public static int runMenu(String title, String[] menuListIn)
	{
		int response;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t***"+title+"***");
		for ( int i = 0; i < menuListIn.length; i++ ) 
		{
			System.out.println("\t"+(i+1)+" - "+menuListIn[i]);
		}
		System.out.print("\nSelect option [1 - "+(menuListIn.length)+"]: ");
		response = sc.nextInt();
		return response;
	}
	
	public static void main(String[] args)
	{
		int option, subOption;
		boolean NoLoopEnd = true;
		boolean NoSubLoopEnd = true;
		String currencyIn;
		Scanner sc = new Scanner(System.in);
		char reply;		
		String[] menuList = { 	"Coin calculator", 
				      	"Multiple coin calculator", 
					"Print coin list",
					"Set details", 
					"Display program configurations", 
					"Quit the program"
				    };

		String[] subMenuList = { "Set currency", 
					 "Set minimum coin input value", 
					 "Set maximum coin input value", 
					 "Return to main menu"
				    };
		
		
		// (a) Use Case for default Constructor
		//     CoinSorter cs = new CoinSorter();
		
		// (b) Use Case for overloaded Constructor
		List<Integer> coinList = new ArrayList<Integer>();
		coinList.add(500);
		coinList.add(200);
		coinList.add(100);
		coinList.add(50);
		coinList.add(20);
		coinList.add(10);
		coinList.add(5);   
		
		CoinSorter cs = new CoinSorter("Euro", 500, 25000, coinList); 
	    
		do
		{
			option = runMenu("Coin Sorter - Main Menu", menuList);
			switch ( option )
			{
				case 1:
					cs.validateTotalValue();				
					cs.validateExcludedCoin();
					System.out.println(cs.coinCalculator(cs.getTotalCoinValue(), cs.getExcludedCoin()));
					break;
				case 2:
					cs.validateTotalValue();				
					cs.validateExcludedCoin();
					System.out.println(cs.multiCoinCalculator(cs.getTotalCoinValue(), cs.getExcludedCoin()));
					break;
				case 3:
					System.out.println(cs.printCoinList());
					break;
				case 4:
					do 
					{
						subOption = runMenu("Set Details Sub-Menu", subMenuList);
						switch ( subOption )
						{
							case 1:
								System.out.print("Enter the Currency (eg US Dollar, Euro): ");
								if ( sc.hasNext() )
									cs.setCurrency(sc.next());
								break;
							case 2:   // Can override default minimum of 0
								System.out.print("Enter the Minimum coin input value: ");
								if ( sc.hasNext() )
									cs.setMinCoinIn(sc.nextInt());
								break;
							case 3:  // Can override default maximum of 10000
								System.out.print("Enter the Maximum coin input value: ");
								if ( sc.hasNext() )
									cs.setMaxCoinIn(sc.nextInt());
								break;
							case 4:
								NoSubLoopEnd = false;
								break;
						}
					} while ( NoSubLoopEnd );
					break;
				case 5:
					System.out.println(cs.displayProgramConfigs());
					break;
				case 6:
					System.out.println("Program Exit");
					NoLoopEnd = false;	
					break;		
			 }
						
		} while ( NoLoopEnd );
		sc.close();
	}
}
