
public class Cellphone {
	private static String electronic;
	private static double weight;
	private static int cost;
	private static double powerusage;
	private static String manufacturer;
	
	public Cellphone(String Electronic, double Weight, int Cost, double PowerUsage, String Manufacturer)
	{
		electronic = Electronic;
		weight = Weight;
		cost = Cost;
		powerusage = PowerUsage;
		manufacturer = Manufacturer;
	}
	
	public String toString()
	{
		return "Electronic: " + electronic + "\n" + "Weight(lbs): " + weight + "\n" + "Cost(dollars): "
				+ cost + "\n" + "Power Usage(watts): " + powerusage + "\n" + "Manufacturer: " 
				+ manufacturer + "\n";
	}
	
}
