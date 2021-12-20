package application;

public class Item {
String weight;
String Name;
int price;
	
	public Item()
	{
		price=0;
	}
	public Item(String weight, String Name, int price)
	{
		this.weight=weight;
		this.Name=Name;
		this.price=price;
	}

	public String getWeight()
	{
		return weight;
	}
	public String getName()
	{
		return Name;
	}
	public int getPrice()
	{
		return price;
	}

}
