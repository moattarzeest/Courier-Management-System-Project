package application;

public class Pickup {

String pickup;
String dropoff;
	
	public Pickup()
	{
		
	}
	public Pickup(String pickup, String dropoff)
	{
		this.pickup=pickup;
		this.dropoff=dropoff;
	}

	public String getPickup()
	{
		return pickup;
	}
	public String getDropoff()
	{
		return dropoff;
	}
}
