import java.util.*;
public class ShoppingTester {
	
	public static void main(String[] args)
	{
		ArrayList<String> shopList = new ArrayList<String>();
		Shopping spg = new Shopping(shopList);
		spg.addItem("Bananas");
		spg.addItem("Potatoes");
		spg.addItem("Milk");
		spg.addItem("Yoghurt");
		System.out.println("Number of items in Shopping List: "+spg.numberOfItems()+".");
		System.out.println("Shopping item in position [2] is "+spg.showItem(1)+".");
		spg.listItems();		
	}
}
