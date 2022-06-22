package jana60;

import java.util.Random;

public class Smartphone extends Prodotto {
	
	//Attributi
	String imei;
	int memoria;
	
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
				generaImei(1)	+
				"-"				;
		
	}

	//Metodi
		
	private String fCifra() 				//Metodo che genera una cifra random tra 1 a 9 e la formatta in stringa
	{
		
		int Cifra = random.nextInt(10);
		return String.valueOf(Cifra);
		
	}
	
	private String generaImei(int slots) 	//Metodo che genera una stringa con cifra casuale da 1 a 9 con "slots" unit�
	{
		
		String cifraImei = "";
		for (int i=0; i<=slots; i++) 
		{
			cifraImei+=fCifra();
		}
		return cifraImei;
		
	}
	
	@Override
	public String toString() 
	{
		
		return "\nCOD:" + getCodice() + "\nProdotto: " + getNome() + "\nMarca: " + getMarca() + "\nPrezzo: " + getPrezzo();
		
	}
}
