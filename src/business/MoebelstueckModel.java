package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MoebelstueckModel {
	private Moebelstueck moebelhaus;

	public Moebelstueck getMoebelhaus() {
		return moebelhaus;
	}

	public void setMoebelhaus(Moebelstueck moebelhaus) {
		this.moebelhaus = moebelhaus;
	}

	public void leseAusDatei() throws IOException {
		BufferedReader ein = new BufferedReader(new FileReader("Moebelstueck.csv"));
		String[] zeile = ein.readLine().split(";");
		this.moebelhaus = new Moebelstueck(zeile[0], zeile[1], zeile[2], Float.parseFloat(zeile[3]),
				zeile[4].split("_"));
		ein.close();

	}

	public void schreibeMoebelstueckeInCsvDatei() throws IOException {
		BufferedWriter aus = new BufferedWriter(new FileWriter("MoebelstueckeAusgabe.csv", true));
		aus.write(moebelhaus.gibMoebelhausZurueck(';'));
		aus.close();

	}

}
