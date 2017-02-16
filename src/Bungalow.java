
public class Bungalow extends Building{
	boolean hasGarden;
	boolean hasPool;
	public Bungalow(int floors, int rooms, String buildingName,boolean hasGarden,boolean hasPool)
	{
		super(floors,rooms,buildingName);
		this.hasGarden = hasGarden;
		this.hasPool = hasPool;
	}
	void print(String bg)
	{
		super.print(bg);
		if(hasGarden)
			System.out.println("Bungalow has a Garden");
		else
			System.out.println("Bungalow doesn't have any Garden");
		if(hasPool)
			System.out.println("Bungalow has a Swimming Pool");
		else
			System.out.println("Bungalow doesn't have any Swimming Pool");
	}
}
