package jana60;

import java.text.DecimalFormat;

public class Prodotto {
	
	//Attributi
	private String codice, nome, marca;
	private double prezzo;
	//Costanti
	private int iva = 22;
	
	//Imports
	DecimalFormat dfEur = new DecimalFormat("0.00€");
	
	//Costruttori
	public Prodotto(String codice, String nome, String marca, double prezzo) {
		
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		
	}
	public Prodotto(Prodotto prodotto) 
	{
		this(prodotto.getCodice(), prodotto.getNome(), prodotto.getMarca(), prodotto.getPrezzo());
	}
	
	//Getter Setter
	public String getCodice() 
	{
		return codice;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getMarca() 
	{
		return marca;
	}

	public void setMarca(String marca) 
	{
		this.marca = marca;
	}

	public double getPrezzo() 
	{
		return prezzo;
	}

	public void setPrezzo(double prezzo) 
	{
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) 
	{
		this.iva = iva;
	}
	
	//METODI
	private String calcPrezzoIvaEur() 		//Metodo che ritorna il prezzo ivato in formato Europeo
	{
		double prezzoIva = prezzo + (prezzo * (iva / 100.00));
		return dfEur.format(prezzoIva);	
	}
	
	private String fPrezzoEur() 				//Metodo che ritorna il prezzo in formato Europeo
	{
		return dfEur.format(prezzo);
	}
	
	@Override
	public String toString() 				//Metodo che ritorna una stringa con i dati del prodotto
	{
		return	"\nCOD: " 			+ codice 			+
				"\nProdotto: " 		+ nome				+
				"\nMarca: " 		+ marca 			+
				"\nPrezzo: " 		+ fPrezzoEur()		+
				"\nIVA: "			+ iva + "%"			+
				"\n"									+
				"Prezzo+IVA: "		+ calcPrezzoIvaEur();
	}

	
}
