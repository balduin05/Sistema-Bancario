package conti_correnti;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Gestione_banca g = new Gestione_banca();
		
		int scelta;
		int cont_n_conti_correnti = 0;
		
		
		// MENU:
		
		do {
			System.out.println();
			System.out.println(" - MENU - ");
			System.out.println("1) Inserire conto corrente");
			System.out.println("2) Visualizza conto corrente");
			System.out.println("3) Versamento");
			System.out.println("4) Prelievo");
			System.out.println("5) Visualizza saldo");
			System.out.println("6) Visualizza cognome");
			System.out.println("7) Visualizza nome");
			System.out.println("8) Visualizza numeri conti correnti");
			System.out.println("9) Trasferimento");
			System.out.println("10) Esci dal programma");
			System.out.println();
			System.out.print("Opzione scelta: ");
			scelta = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(scelta) {
			
			case 1:
				g.inserimento();
				cont_n_conti_correnti ++;
				break;
				
			case 2:
				g.visualizza();
				break;
				
			case 3:
				if(cont_n_conti_correnti > 0) {
					int n_conto_corrente;
					double somma;
					
					do {
						System.out.print("Numero conto corrente: ");
						n_conto_corrente = keyboard.nextInt();
						keyboard.nextLine();
						
					}while(n_conto_corrente < 0);
					
					
					do {
						System.out.print("Totale somma da versare al conto corrente " + n_conto_corrente + ": ");
						somma = keyboard.nextDouble();
						keyboard.nextLine();
						
					}while(somma < 0);
					
					g.versamento(somma, n_conto_corrente);
					
				}else {
					System.out.println("Errore: il programma è vuoto!");
					
				}
				
				break;
				
			case 4:
				if(cont_n_conti_correnti > 0) {
					int n_conto_corrente;
					double somma;
					
					do {
						System.out.print("Numero conto corrente: ");
						n_conto_corrente = keyboard.nextInt();
						keyboard.nextLine();
						
					}while(n_conto_corrente < 0);
					
					
					do {
						System.out.print("Totale somma da prelevare dal conto corrente " + n_conto_corrente + ": ");
						somma = keyboard.nextDouble();
						keyboard.nextLine();
						
					}while(somma < 0);
					
					g.prelievo(somma, n_conto_corrente);
					
				}else {
					System.out.println("Errore: il programma è vuoto!");
					
				}
				
				break;
				
			case 5:
				if(cont_n_conti_correnti > 0) {
					int n_conto_corrente;
					
					do {
						System.out.print("Numero conto corrente: ");
						n_conto_corrente = keyboard.nextInt();
						keyboard.nextLine();
						
					}while(n_conto_corrente < 0);
					
					
					g.saldo(n_conto_corrente);
					
				}else {
					System.out.println("Errore: il programma è vuoto!");
					
				}
				
				break;
				
			case 6:
				if(cont_n_conti_correnti > 0) {
					int n_conto_corrente;
					
					do {
						System.out.print("Numero conto corrente: ");
						n_conto_corrente = keyboard.nextInt();
						keyboard.nextLine();
						
					}while(n_conto_corrente < 0);
					
					
					g.cognome(n_conto_corrente);
					
				}else {
					System.out.println("Errore: il programma è vuoto!");
					
				}
				
				break;
				
			case 7:
				if(cont_n_conti_correnti > 0) {
					int n_conto_corrente;
					
					do {
						System.out.print("Numero conto corrente: ");
						n_conto_corrente = keyboard.nextInt();
						keyboard.nextLine();
						
					}while(n_conto_corrente < 0);
					
					
					g.nome(n_conto_corrente);
					
				}else {
					System.out.println("Errore: il programma è vuoto!");
					
				}
				
				break;
				
			case 8:
				if(cont_n_conti_correnti > 0) {
					g.n_conti_correnti();
					break;
					
				}
				
			case 9:
				if(cont_n_conti_correnti > 0) {
					int n_conto_corrente_1;
					int n_conto_corrente_2;
					double somma;
					
					do {
						System.out.print("Numero conto corrente di cui si vogliono prendere i soldi: ");
						n_conto_corrente_1 = keyboard.nextInt();
						keyboard.nextLine();
						
					}while(n_conto_corrente_1 < 0);
					
					do {
						System.out.print("Numero conto corrente di cui si vogliono trasferire i soldi: ");
						n_conto_corrente_2 = keyboard.nextInt();
						keyboard.nextLine();
						
					}while(n_conto_corrente_2 < 0);
					
					do {
						System.out.print("Inserire la somma di denaro da trasferire dal conto corrente numero " + n_conto_corrente_1 + " al conto corrente numero " + n_conto_corrente_2 + ": ");
						somma = keyboard.nextDouble();
						keyboard.nextLine();
						
					}while(somma < 0);
					
					g.trasferimento(n_conto_corrente_1, n_conto_corrente_2, somma);
					
					break;
					
				}else {
					System.out.println("Errore: il programma è vuoto!");
					
				}
				
			}
			
		}while(scelta != 10);

	}

}
