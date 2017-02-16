
public class Building {
	private int floors;
	private int rooms;
	private String buildingName;
	Building(Building b)
	{
		floors = b.floors;
		rooms = b.rooms;
		buildingName = b.buildingName;
	}
	Building(int floors,int rooms, String buildingName)
	{
		this.floors = floors;
		this.rooms = rooms;
		this.buildingName = buildingName;
	}
	void  print(String bdname)
	{
		System.out.println("Details of "+bdname+" : ");
		System.out.println("No. of Floors : "+floors);
		System.out.println("No. of Rooms : "+rooms);
		System.out.println("Name of the Building : "+buildingName);
	}
}
