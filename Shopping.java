import java.util.*;

public class Shopping {
	
	private ArrayList<String> shoppingList = new ArrayList<String>();
	
	public Shopping(ArrayList<String> shoppingListIn)
	{
		shoppingList = shoppingListIn;
	}
	
	public void addItem(String celeb)
	{
		shoppingList.add(celeb);
	}
	
	public int numberOfItems()
	{
		return shoppingList.size();
	}
	
	public String showItem(int index)
	{
		return shoppingList.get(index);
	}
	
	public void listItems()
	{
		System.out.println("===List of items===");
		for ( int i = 0; i < shoppingList.size(); i++ )
		{
			System.out.println(shoppingList.get(i));
		}
	}
	
}
