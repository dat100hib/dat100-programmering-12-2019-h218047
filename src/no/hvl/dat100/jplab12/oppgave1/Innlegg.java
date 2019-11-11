package no.hvl.dat100.jplab12.oppgave1;

import no.hvl.dat100.jplab12.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	
	// KG: Er det rett å endre typen til final? det skal vel ikkje være mulig å endre id, bruker, eller dato til eit innlegg i ettertid?
	
	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes; // antall likes kan endre seg.  
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		// TODO 
		this.id = id; 
		this.bruker = bruker; 
		this.dato = dato; 
		this.likes = 0; // Startverdi ved opprettelse av innlegg, kan endre seg. 
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		
		this.id = id; 
		this.bruker = bruker; 
		this.dato = dato; 
		this.likes = likes; 
	}
	
	public String getBruker() {
		
		//throw new UnsupportedOperationException(TODO.method());
		
		return this.bruker;
	}

	public void setBruker(String bruker) {
		//throw new UnsupportedOperationException(TODO.method());
		
		this.bruker = bruker; 
	}

	public String getDato() {
		//throw new UnsupportedOperationException(TODO.method());
		return this.dato;
		
	}

	public void setDato(String dato) {
		//throw new UnsupportedOperationException(TODO.method());
		this.dato = dato;
	}

	public int getId() {
		//throw new UnsupportedOperationException(TODO.method());
		return this.id;

	}

	public int getLikes() {
		//throw new UnsupportedOperationException(TODO.method());
		return this.likes;

	}
	
	public void doLike () {
		//throw new UnsupportedOperationException(TODO.method());
		this.likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		// throw new UnsupportedOperationException(TODO.method());
		boolean likhet = false; 
		
		if (this.id == innlegg.getId()) {
			likhet = true; 
		}
		return likhet;
	
	}
	
	@Override
	public String toString() {
		
		// throw new UnsupportedOperationException(TODO.method());
		String message = this.id +"\n"+this.bruker+"\n"+this.dato+"\n"+this.likes+"\n";
		return message;	
		
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
