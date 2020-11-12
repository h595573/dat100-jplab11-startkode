package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		Boolean bleSkrevet = false;
		
		try {
			PrintWriter write = new PrintWriter(mappe+filnavn);
			String blogg = samling.toString();
			
			write.write(blogg);
			bleSkrevet = true;
			write.close();
			
		} catch (FileNotFoundException e){
			System.out.println("Filen " + filnavn + " i mappe " + mappe + " ble ikke funnet...");
			
		} return bleSkrevet;
	}
}
