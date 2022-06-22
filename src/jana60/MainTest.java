package jana60;

public class MainTest {

	public static void main(String[] args) {
		
		System.out.println("Ciao, questo è uno Smartphone:");
		Prodotto p1 = new Prodotto("1969", "Samsung Galaxy S1", "Samsung", 800.00, 23);
		Smartphone samsungGalaxy = new Smartphone(p1, 50);
		System.out.println(samsungGalaxy.toString());
		
		
	}

}
