package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.Innlegg;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";
	//private static String FILNAVN = "blogg.dat";

	public static boolean skriv(Blogg samling, String filnavn) {

		// throw new UnsupportedOperationException(TODO.method());
		
		boolean fungerte = false;
		

        try {

            //FileWriter fil = new FileWriter(filnavn, true); // viktig å sette append true.
        	File file = new File(MAPPE + filnavn);
            BufferedWriter utskrift = new BufferedWriter(new  FileWriter(file, false));

            utskrift.append(samling.toString()+"\n");
            utskrift.close();
            fungerte = true; 
            
        }
        catch (FileNotFoundException e) {
            System.out.println("Kunne ikke finne filen");
        }
        catch (IOException e){
            System.out.println("io exception greier ");
        }
		
		return fungerte;
	}
}
