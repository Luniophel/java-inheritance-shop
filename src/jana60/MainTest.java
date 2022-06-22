package jana60;

public class MainTest {

	public static void main(String[] args) {
		
		//Test Smartphone
		System.out.println("Ciao, questo è uno Smartphone:");
		Prodotto p1 = new Prodotto("1969", "Samsung Galaxy S1", "Samsung", 800.00);
		Smartphone samsungGalaxy = new Smartphone(p1, 50);
		System.out.println(samsungGalaxy.toString());
		
		//Test Televisore
		System.out.println("\nQuesto invece è un televisore:");
		Prodotto p2 = new Prodotto("9932", "Sony SmartTV", "Sony", 500.00);
		Televisori sonySmartTV = new Televisori(p2, true, 52);
		System.out.println(sonySmartTV.toString());
		
		//Test Cuffie
		System.out.println("\nInfine, queste sono delle cuffie:");
		Prodotto p3 = new Prodotto("1187", "Turtle Beach Headset", "TurtleBeach", 50.00);
		Cuffie turtleBeachHeadset = new Cuffie (p3, "Bianche", false );
		System.out.println(turtleBeachHeadset.toString());
		
	}

}
