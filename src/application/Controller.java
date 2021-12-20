package application;

public class Controller {

	//private int orderNo;
	 String username;
	String pickup;
	String dropoff;
 String weight;
	 String product;
	int bill;
	
	public Controller()
	{
		
	}
	
	public Controller(String username, String pickup, String dropoff, String weight, String product, int bill)
	{
		//this.orderNo=orderNo;
		this.username=username;
		this.pickup=pickup;
		this.dropoff=dropoff;
		this.weight=weight;
		this.product=product;
		this.bill=bill;
	}
	public void setUser(String username)
	{
		this.username=username;
	}
	public void setPickup(String pickup)
	{
		this.pickup=pickup;
	}
	public void setDropoff(String dropoff)
	{
		this.dropoff=dropoff;
	}
	public void setWeight(String weight)
	{
		this.weight=username;
	}
	public void setProduct(String product)
	{
		this.product=product;
	}
	public void setBill(int bill)
	{
		this.bill=bill;
	}
	
	public String getUser()
	{
		return username;
	}
	
	public String getPickup()
	{
		return pickup;
	}
	
	public String getDropoff()
	{
		return dropoff;
	}
	
	public String getWeight()
	{
		return weight;
	}
	public String getProduct()
	{
		return product;
	}
	
	public int getBill()
	{
		return bill;
	}
	

}
