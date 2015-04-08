
public class Computer {

	private static String electronic;
	private static int weight;
	private static int cost;
	private static int powerusage;
	private static String manufacturer;
	
	public Computer(String Electronic, int Weight, int Cost, int PowerUsage, String Manufacturer)
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
