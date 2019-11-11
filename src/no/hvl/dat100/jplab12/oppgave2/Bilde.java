package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String url; 
	
	public Bilde() {
		
	}
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		//throw new UnsupportedOperationException(TODO.constructor("Bilde"));
		super(id, bruker, dato, tekst);
		this.url = url;
	}
	
	//Bilde bilde1 = new Bilde(40, "kristoffer", "2020-20-2", "blabla", "Www.bilde.com");
	

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		//throw new UnsupportedOperationException(TODO.constructor("Bilde"));
		super(id, bruker, dato, likes, tekst);
		this.url = url;
	}
	
	public String getUrl() {
		//throw new UnsupportedOperationException(TODO.method());
		return this.url;

	}

	public void setUrl(String url) {
		//throw new UnsupportedOperationException(TODO.method());
		this.url = url;
	}

	@Override
	public String toString() {
		// throw new UnsupportedOperationException(TODO.method ());
		String melding = "BILDE"+"\n"+id+"\n"+bruker+"\n"+dato+"\n"+likes+"\n"+ tekst +"\n"+url+"\n";
		return melding;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
		
	}
}
