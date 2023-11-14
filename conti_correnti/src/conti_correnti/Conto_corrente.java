package conti_correnti;

import java.util.Scanner;

public class Conto_corrente {


	// ATTRIBUTI:

	private int n_conto_corrente;
	private double saldo;
	private String cognome;
	private String nome;


	// COSTRUTTORE DEFAULT:

	public Conto_corrente() {
		this.n_conto_corrente = 0;
		this.saldo = 0;
		this.cognome = "";
		this.nome = "";

	}


	// COSTRUTTORE CON PARAMETRI:

	public Conto_corrente(int n_conto_corrente, double saldo, String cognome, String nome) {
		this.n_conto_corrente = n_conto_corrente;
		this.saldo = saldo;
		this.cognome = cognome;
		this.nome = nome;

	}


	// METODI SET & GET:

	// N_CONTO_CORRENTE:

	public void setN_conto_corrente(int n_conto_corrente) {
		if(n_conto_corrente >= 0) {
			this.n_conto_corrente = n_conto_corrente;

		}else {
			this.n_conto_corrente = 0;

		}
	}

	public int getN_conto_corrente() {
		return n_conto_corrente;

	}


	// SALDO:

	public void setSaldo(double saldo) {
		if(saldo >= 0) {
			this.saldo = saldo;

		}else {
			this.saldo = 0;

		}
	}

	public double getSaldo() {
		return saldo;

	}


	// COGNOME:

	public void setCognome(String cognome) {
		if(cognome.length() > 0) {
			this.cognome = cognome;

		}else {
			this.cognome = "";

		}
	}

	public String getCognome() {
		return cognome;

	}


	// NOME:

	public void setNome(String nome) {
		if(nome.length() > 0) {
			this.nome = nome;

		}else {
			this.nome = "";

		}
	}

	public String getNome() {
		return nome;

	}
	
	
	// METODO VERSAMENTO:
	
	public void versamento(double somma) {
		if(somma > 0) {
			double versamento;
			versamento = getSaldo() + somma;
			setSaldo(versamento);
			
		}else {
			System.out.println("Errore: impossibile versare cifre negative!");
			
		}
	}
	
	
	// METODO PRELIEVO:
	
	public void prelievo(double somma) {
		if(somma < getSaldo()) {
			double prelievo;
			prelievo = getSaldo() - somma;
			setSaldo(prelievo);
			
		}else {
			System.out.println("Errore: impossibile prelevare => soldi insfuccienti!");
			
		}
	}


	// METODO INSERIMENTO:

	public void inserimento() {
		Scanner keyboard = new Scanner(System.in);

		int n_conto_corrente;
		double saldo;
		String cognome;
		String nome;
		
		
		// N_CONTO_CORRENTE:
		
		do {
			System.out.print("Numero conto corrente: ");
			n_conto_corrente = keyboard.nextInt();
			keyboard.nextLine();
			
		}while(n_conto_corrente < 0);
		setN_conto_corrente(n_conto_corrente);
		
		
		// SALDO:
		
		do {
			System.out.print("Saldo: ");
			saldo = keyboard.nextDouble();
			keyboard.nextLine();
			
		}while(saldo < 0);
		setSaldo(saldo);
		
		
		// COGNOME:
		
		do {
			System.out.print("Cognome: ");
			cognome = keyboard.nextLine();
			
		}while(cognome.length() <= 0);
		setCognome(cognome);
		
		
		// NOME:
		
		do {
			System.out.print("Nome: ");
			nome = keyboard.nextLine();
			
		}while(nome.length() <= 0);
		setNome(nome);
		
	}

	
	// METODO VISUALIZZA:
	
	public void visualizza() {
		System.out.println();
		System.out.println("Numero conto corrente: " + n_conto_corrente);
		System.out.println("Saldo: " + saldo + "€");
		System.out.println("Cognome: " + cognome);
		System.out.println("Nome: " + nome);
		System.out.println();
		
	}
}
