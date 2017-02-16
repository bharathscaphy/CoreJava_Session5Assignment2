
public class Duplex extends Building {
	boolean hasPool;
	boolean hasGarden;
	boolean hasPenthouse;
	public Duplex(int floors,int rooms, String buildingName,boolean hasPool, boolean hasGarden,boolean hasPenthouse)
	{
		super(floors,rooms,buildingName);
		this.hasPool = hasPool;
		this.hasGarden = hasGarden;
		this.hasPenthouse = hasPenthouse;
	}
	void print(String dp)
	{
		super.print(dp);
		if(hasPool)
			System.out.println("Duplex has a Swimming Pool");
		else
			System.out.println("Duplex doesn't have a Swimming Pool");
		if(hasGarden)
			System.out.println("Duplex has a Garden");
		else
			System.out.println("Duplex doesn't have a Garden");
		if(hasPenthouse)
			System.out.println("Duplex has a Penthouse");
		else
			System.out.println("Duplex doesn't have a Penthouse");
	}
}
