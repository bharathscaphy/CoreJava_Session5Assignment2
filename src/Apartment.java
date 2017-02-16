
public class Apartment extends Building {
	boolean hasSecurity;
	int noOfFlats;
	boolean hasLift;
	public Apartment(int floors, int rooms, String buildingName,boolean hasSecurity, int noOfFlats, boolean hasLift)
	{
		super(floors,rooms,buildingName);
		this.hasSecurity = hasSecurity;
		this.noOfFlats = noOfFlats;
		this.hasLift = hasLift;
	}
	void print(String ap)
	{
		super.print(ap);
		System.out.println("No of Flats : "+noOfFlats);
		if(hasSecurity)
			System.out.println("Apartment has Guarded Secuirty");
		else
			System.out.println("Apartment doesn't have any Guarded Security");
		if(hasLift)
			System.out.println("Apartment has a Lift");
		else
			System.out.println("Apartment doesn't have any Lift");
	}
}