
public class BuildingMain {
	public static void main(String[] args)
	{
		Apartment app=new Apartment(10,120,"Venkateshwara Residency",true,40,true);
		System.out.println();
		app.print("Apartment");
		
		Duplex dup=new Duplex(2,15,"Pragathi Nilayam",false,true,true);
		System.out.println();
		dup.print("Duplex");
		
		Bungalow bun=new Bungalow(1,20,"Raja Mahal Palace",true,true);
		System.out.println();
		bun.print("Bungalow");
	}
}
