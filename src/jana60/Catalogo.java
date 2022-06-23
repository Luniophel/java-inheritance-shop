package jana60;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		
		//Imports
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Benvenuto nel tuo catalogo Java.");
		
		//Dichiarazione dimensione del catalogo
		System.out.println("Quanti prodotti vuoi inserire?");
		int nProdotti = Integer.parseInt(scan.nextLine());
		
		//Creazione vettore catalogo
		Prodotto[] catalogo = new Prodotto[nProdotti];
		
		//Riempimento degli slot del vettore catalogo
		int i = 0; 		//dichiarazione index degli slot
		while (i < catalogo.length)
		{
			
			System.out.println("\nChe tipo di prodotto vuoi inserire?");
			System.out.println("1-Smartphone, 2-Televisore, 3-Cuffie");
			int scelta = Integer.parseInt(scan.nextLine());		//Raccolta input
						
			System.out.println("Inserisci i dati del prodotto");
			
			System.out.print("Codice prodotto: ");
			String tempCodice = scan.nextLine();
			
			System.out.print("Nome prodotto: ");
			String tempNome = scan.nextLine();
			
			System.out.print("Marca: ");
			String tempMarca = scan.nextLine();
			
			System.out.print("Prezzo: ");
			Double tempPrezzo = Double.parseDouble(scan.nextLine());
			
			Prodotto tempProdotto = new Prodotto(tempCodice, tempNome, tempMarca, tempPrezzo);
			
			
			boolean continua = true;
			do {
				//Intesimento dati caratterizzanti del prodotto
				switch (scelta) 
				{
					case 1: //Caso Smartphone
						System.out.print("Memoria: ");
						int tempMem = Integer.parseInt(scan.nextLine());
						catalogo[i] = new Smartphone(tempProdotto, tempMem);
						break;
						

					case 2: //Caso Televisore
						boolean tempSmart = false;
						continua = true;
						do 
						{
							System.out.println("è smart? ");
							System.out.println("1- SI, 2- NO");
							String risposta = scan.nextLine();
							switch (risposta) 
							{
								case "1":
									tempSmart = true;
									continua = true;
									break;
									
								case "2":
									tempSmart = false;
									continua = true;
									break;
								
								default:
									System.out.println("Risposta non valida, ritenta.");
									continua = false;
									break;
							}
						} 
						while (continua == false);
						System.out.print("Dimensioni: ");
						int tempDimensioni = Integer.parseInt(scan.nextLine());
						catalogo[i] = new Televisori(tempProdotto, tempSmart, tempDimensioni);
						break;

					case 3: //Caso Cuffie
						System.out.print("Colore: ");
						String tempColore = scan.nextLine();
						boolean tempWireless = false;
						continua = true;
						do 
						{
							System.out.println("è wireless?");
							System.out.println("1- SI, 2- NO");
							String risposta = scan.nextLine();
							switch (risposta) 
							{
								case "1":
									tempWireless = true;
									continua = true;
									break;
									
								case "2":
									tempWireless = false;
									continua = true;
									break;
									
								default:
									System.out.println("Risposta non valida, ritenta.");
									continua = false;
									break;
							}
						} 
						while (continua == false);
						catalogo[i] = new Cuffie(tempProdotto, tempColore, tempWireless);
						break;

				default: //Caso di inserimento non valido
					System.out.println("Scelta non valida, ritenta.");
					continua = false;

				}
			} 
			while (continua == false);
			
			i++;
		}
		
		System.out.println("\nEcco il catalogo che hai creato:");
		
		for (int counter=0; counter < catalogo.length; counter++)
		{
			
			System.out.println("________________________________");
			System.out.println(catalogo[counter].toString());
			
		}
		
		scan.close();
		
		
	}

}
