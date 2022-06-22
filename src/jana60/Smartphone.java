package jana60;

import java.util.Random;

public class Smartphone extends Prodotto {
	
	//Attributi
	String imei;
	int memoria;
	
	//Imports
	Random random = new Random();
	
	//Costruttori
	public Smartphone(Prodotto prodotto, int memoria) 
	{
		
		super(prodotto);
		this.memoria = memoria;
		imei=	generaImei(6)	+
				"-"				+
				generaImei(2)	+
				"-"				+
				generaImei(6)	+
				"-"				+
				generaImei(1)	;
		
	}

	//Metodi
		
	private String fCifra() 				//Metodo che genera una cifra random tra 1 a 9 e la formatta in stringa
	{
		
		int Cifra = random.nextInt(10);
		return String.valueOf(Cifra);
		
	}
	
	private String generaImei(int slots) 	//Metodo che genera una stringa con cifra casuale da 1 a 9 con "slots" unità
	{
		
		String cifraImei = "";
		for (int i=0; i<slots; i++) 
		{
			cifraImei+=fCifra();
		}
		return cifraImei;
		
	}
	
	@Override
	public String toString() 				//Metodo che ritorna una stringa con i dati del prodotto
	{
		
		return 	"\nCategoria: "		+ "Smartphone"		+
				super.toString()						+
				"\nMemoria: "		+ memoria			+
				"\nC.IMEI: "		+ imei				;
		
	}
}
