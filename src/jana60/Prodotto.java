package jana60;

public class Prodotto {
	
	//Attributi
	private String codice, nome, marca;
	private double prezzo;
	//Costanti
	private int iva;
	
	//Costruttori
	public Prodotto(String codice, String nome, String marca, double prezzo, int iva) {
		
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
		
	}
	public Prodotto(Prodotto prodotto) {
		this(prodotto.getCodice(), prodotto.getNome(), prodotto.getMarca(), prodotto.getPrezzo(), prodotto.getIva());
	}
	
	//Getter Setter
	public String getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	
}
