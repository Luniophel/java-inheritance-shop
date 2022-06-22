package jana60;

public class Televisori extends Prodotto {

	//Attributi
	boolean smart;
	int dimensioni;
	
	//Costruttori
	public Televisori(Prodotto prodotto, boolean smart, int dimensioni) 
	{
		super(prodotto);
		this.smart = smart;
		this.dimensioni = dimensioni;
	}
	
	//Metodi
	String isSmart () 						//Metodo che ritorna una stringa con SI se il prodotto è SMART, NO se non lo è.
	{
		if (smart)
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
		
		return 	"\nCategoria: "		+ "Smartphone"					+
				super.toString()									+
				"\nFunzioni Smart: "+ isSmart()						+
				"\nDimensioni: "	+ dimensioni 		+ " pollici";
		
	}
	
	

}
