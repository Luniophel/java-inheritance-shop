package jana60;

public class MainTest {

	public static void main(String[] args) {
		
		System.out.println("Ciao, questo è uno Smartphone:");
		Prodotto p1 = new Prodotto("1969", "Samsung Galaxy S1", "Samsung", 800.00);
		Smartphone samsungGalaxy = new Smartphone(p1, 50);
		System.out.println(samsungGalaxy.toString());
		
		System.out.println("Questo invece è un televisore:");
		Prodotto p2 = new Prodotto("9932", "Sony SmartTV", "Sony", 500.00);
		Televisori sonySmartTV = new Televisori(p2, true, 52);
		System.out.println(sonySmartTV.toString());
		
	}

}
