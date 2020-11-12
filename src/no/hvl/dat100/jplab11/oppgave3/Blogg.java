package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {	
	private Innlegg [] innleggtabell;
	private int nesteledige;

	public Blogg() {
		this.innleggtabell = new Innlegg [20] ;
		this.nesteledige = 0; 
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledige = 0;
	}

	public int getAntall() {
		return this.nesteledige;
	}
	
	public Innlegg[] getSamling() {
		return this.innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int k=0; k<this.nesteledige; k++) {
			if (this.innleggtabell[k].erLik(innlegg)) {
				return k;
			}
		} return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		if (finnInnlegg(innlegg) != -1) {
			return true;
		} return false;
	}

	public boolean ledigPlass() {
		if (this.nesteledige < this.innleggtabell.length) {
			return true;
		} return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if ((!finnes(innlegg))&&(ledigPlass())) {
			this.innleggtabell[this.nesteledige] = innlegg;
			this.nesteledige ++;
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String tekst = this.innleggtabell.length + "\n";
		for (int k=0; k<this.nesteledige; k++) {
			tekst += this.innleggtabell[k].toString();
		} return tekst;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}