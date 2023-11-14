package conti_correnti;

import java.util.ArrayList;

public class Gestione_banca {

	// DICHIARAZIONE ARRAYLIST:
	
	ArrayList<Conto_corrente> aL = new ArrayList<>();
	
	
	// METODO INSERIMENTO CONTO CORRENTE:
	
	public void inserimento() {
		Conto_corrente c = new Conto_corrente();
		
		boolean n_conto_corrente_trovato = false;
		
		System.out.println();
		System.out.println("Inserire conto corrente " +  (aL.size() + 1) + ": ");
		System.out.println();
		c.inserimento();
		
		for(Conto_corrente cc : aL) {
			if(cc.getN_conto_corrente() == c.getN_conto_corrente()) {
				n_conto_corrente_trovato = true;
				
				break;
				
			}
		}
		
		if(n_conto_corrente_trovato) {
			System.out.println("Errore: impossibile creare il conto corrente => conto corrente già in uso!");
			
		}else {
			aL.add(c);
			
		}
	}
	
	
	// METODO VISUALIZZA:
	
	public void visualizza() {
		if(aL.size() > 0) {
			for(Conto_corrente c : aL) {
				c.visualizza();
				
			}
		}else {
			System.out.println("Errore: il programma è vuoto!");
			
		}
	}
	
	
	
	// METODO VERSAMENTO:
	
	public void versamento(double somma, int n_conto_corrente) {
		if(aL.size() > 0) {
			boolean n_conto_corrente_trovato = false;
			
			for(Conto_corrente c : aL) {
				if(c.getN_conto_corrente() == n_conto_corrente) {
					n_conto_corrente_trovato = true;
					double versamento = c.getSaldo() + somma;
					c.setSaldo(versamento);
					
					break;
					
				}
			}
			
			if(!n_conto_corrente_trovato) {
				System.out.println("Errore: numero conto corrente non esistente!");
				
			}
		}else {
			System.out.println("Errore: il programma è vuoto!");
			
		}
	}
	
	
	// METODO PRELIEVO:
	
	public void prelievo(double somma, int n_conto_corrente) {
		if(aL.size() > 0) {
			boolean n_conto_corrente_trovato = false;
			
			for(Conto_corrente c : aL) {
				if((c.getN_conto_corrente() == n_conto_corrente) && (somma <= c.getSaldo())) {
					n_conto_corrente_trovato = true;
					double prelievo = c.getSaldo() - somma;
					c.setSaldo(prelievo);
					
					break;
					
				}
			}
			
			if(!n_conto_corrente_trovato) {
				System.out.println("Errore: numero conto corrente non esistente, oppure soldi insufficienti!");
				
			}
		}else {
			System.out.println("Errore: il programma è vuoto!");
			
		}
	}
	
	
	// METODO RESTITUZIONE SALDO:
	
	public void saldo(int n_conto_corrente) {
		if(aL.size() > 0) {
			boolean n_conto_corrente_trovato = false;
			
			for(Conto_corrente c : aL) {
				if(c.getN_conto_corrente() == n_conto_corrente) {
					n_conto_corrente_trovato = true;
					System.out.println("Saldo del conto corrente numero " + n_conto_corrente + ": " + c.getSaldo() + "€");
					
					break;
					
				}
			}
			
			if(!n_conto_corrente_trovato) {
				System.out.println("Errore: numero conto corrente non esistente!");
				
			}
		}else {
			System.out.println("Errore: il programma è vuoto!");
			
		}
	}
	
	
	// METODO RESTITUZIONE COGNOME:
	
	public void cognome(int n_conto_corrente) {
		if(aL.size() > 0) {
			boolean n_conto_corrente_trovato = false;
			
			for(Conto_corrente c : aL) {
				if(c.getN_conto_corrente() == n_conto_corrente) {
					n_conto_corrente_trovato = true;
					System.out.println("Cognome cliente del conto corrente numero " + n_conto_corrente + ": " + c.getCognome());
					
					break;
					
				}
			}
			
			if(!n_conto_corrente_trovato) {
				System.out.println("Errore: numero conto corrente non esistente!");
				
			}
		}else {
			System.out.println("Errore: il programma è vuoto!");
			
		}
	}
	
	
	// METODO RESTITUZIONE NOME:
	
	public void nome(int n_conto_corrente) {
		if(aL.size() > 0) {
			boolean n_conto_corrente_trovato = false;
			
			for(Conto_corrente c : aL) {
				if(c.getN_conto_corrente() == n_conto_corrente) {
					n_conto_corrente_trovato = true;
					System.out.println("Nome cliente del conto corrente numero " + n_conto_corrente + ": " + c.getNome());
					
					break;
					
				}
			}
			
			if(!n_conto_corrente_trovato) {
				System.out.println("Errore: numero conto corrente non esistente!");
				
			}
		}else {
			System.out.println("Errore: il programma è vuoto!");
			
		}
	}
	
	
	// METODO RESTITUZIONE N_CONTI_CORRENTI:
	
	public void n_conti_correnti() {
		if(aL.size() > 0) {
			
			System.out.println(" - CONTI CORRENTI ALL'INTERNO DELLA BANCA - ");
			
			for(Conto_corrente c : aL) {
				System.out.println(c.getN_conto_corrente());
				
			}
		}else {
			System.out.println("Errore: il programma è vuoto!");
			
		}
	}
	
	
	// METODO TRASFERIMENTO (DA FARE):
	
	
	public void trasferimento(int n_conto_corrente_1, int n_conto_corrente_2, double somma) {
		if(aL.size() > 0) {
			// RICERCA PRIMO CONTO CORRENTE:
			
			boolean n_conto_corrente_1_trovato = false;
			double prelievo = 0;
			double trasferimento = 0;
			
			for(Conto_corrente c : aL) {
				if(c.getN_conto_corrente() == n_conto_corrente_1) {
					n_conto_corrente_1_trovato = true;
					
					prelievo = c.getSaldo() - somma;
					c.setSaldo(prelievo);
					
					break;
					
				}
			}
			
			// RICERCA SECONDO CONTO CORRENTE:
			
			boolean n_conto_corrente_2_trovato = false;
			
			for(Conto_corrente c : aL) {
				if(c.getN_conto_corrente() == n_conto_corrente_2) {
					n_conto_corrente_2_trovato = true;
					
					trasferimento = c.getSaldo() + prelievo;
					c.setSaldo(trasferimento);
					
					break;
					
				}
			}
			
			if(n_conto_corrente_1_trovato && n_conto_corrente_2_trovato) {
				System.out.println("Trasferimento avvenuto con successo!");				
				
			}else {
				System.out.println("Errore: qualcosa è andato storto...");
				
			}
		}else {
			System.out.println("Errore: il programma è vuoto!");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
