package jana60;

public class Cuffie extends Prodotto {
	
	//Attributi
	String colore;
	boolean wireless;

	//Costruttori
	public Cuffie(Prodotto prodotto, String colore, boolean wireless) 
{
		super(prodotto);
		this.colore = colore;
		this.wireless = wireless;
}

	//Metodi
	String isWireless()
	{
		if(wireless)
		{
			return "SI";
		}
		else
		{
			return "NO";
		}
	}
	
	@Override
	public String toString() 				//Metodo che ritorna una stringa con i dati del prodotto
	{
		
		return 	"\nCategoria: "		+ "Headset"		+
				super.toString()					+
				"\nColore: "		+ colore		+
				"\nWireless: "		+ isWireless() 	;
		
	}
}
