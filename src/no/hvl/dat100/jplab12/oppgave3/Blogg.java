package no.hvl.dat100.jplab12.oppgave3;

import java.util.List;
import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable 
	Innlegg[] samling; 
	private int nesteLedig; 

	public Blogg() {
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
		this.nesteLedig = 0;
		this.samling = new Innlegg[20];
	}

	public Blogg(int lengde) {
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
		this.nesteLedig = 0;
		this.samling = new Innlegg[lengde];
	}

	public int getAntall() {
		//throw new UnsupportedOperationException(TODO.method());
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		//throw new UnsupportedOperationException(TODO.method());
		return this.samling;
	}
	
	public int finnInnlegg(Innlegg innlegg) {  // returnerer posisjonen til innlegget. 

		int p = -1;
		int i = 0;
		while (i < nesteLedig && p == -1) {
			if (samling[i].erLik(innlegg)) {
				p = i;
			}
			i++;
		}
		return p;
	}

	public boolean finnes(Innlegg innlegg) {
		//throw new UnsupportedOperationException(TODO.method());
		boolean likhet = false; 
		
		int id = finnInnlegg(innlegg);
		
		// Dersom id ikke finnes vil verdien på id bli lik -1 og metoden finnes vil returnere false. 
		if (id != -1 ) {
			likhet = true; 
		}
		return likhet;
	}

	public boolean ledigPlass() {
		//throw new UnsupportedOperationException(TODO.method());
		
		boolean ledig = false;
		
		if (nesteLedig < samling.length) {
			ledig = true;
		}
		
		return ledig;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		boolean lagtInn = false;
		
        if (!finnes(innlegg)) { // Objektet finnes ikke. 
            if (nesteLedig < samling.length) { // Det er ledig plass
            
            	samling[nesteLedig] = innlegg;
                nesteLedig++;
                lagtInn = true;
                
            }
        }
        return lagtInn;
	}
	
	public String toString() {
		
		//throw new UnsupportedOperationException(TODO.method());
		String melding = ""+ nesteLedig +"\n";
		
		for (Innlegg i: samling) {
			melding += i.toString();
		}
		
//		for (int i = 0; i<samling.length; i++) {
//			
//			melding = samling[i].toString();
//		}
//		
		return melding; 
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		//throw new UnsupportedOperationException(TODO.method());
		
		Innlegg[] samling2 = new Innlegg[samling.length*2];
		
		for (int i = 0; i < nesteLedig; i++) {
			samling2[i] = samling[i];
		}
		samling = samling2;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		if (samling.length == nesteLedig) {
			utvid();
		}
		return leggTil(innlegg);
		
	}
	
	public boolean slett(Innlegg innlegg) { // feil i originalkode, metodetype void originalt.
		
		//throw new UnsupportedOperationException(TODO.method());
		int p = finnInnlegg(innlegg); // finner posisjonen til innlegg.
        if (p >= 0) {
            nesteLedig--;
            samling[p] = samling[nesteLedig];
            samling[nesteLedig] = null;
            return true;
        } else {
            return false;
        }
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}