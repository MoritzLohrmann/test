package gui;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;

//import business.Moebelstueck;
import business.MoebelstueckModel;
import javafx.stage.Stage;

public class MoebelstueckControl {
	private MoebelstueckModel moebelstueckModel;
	private MoebelstueckView moebelstueckView;

	public MoebelstueckControl(Stage primaryStage) {
		this.moebelstueckModel = new MoebelstueckModel();
		this.moebelstueckView = new MoebelstueckView(this, moebelstueckModel, primaryStage);
	}

	public void nenehmeMoebelhausAuf(String typ) {
		try {
			if ("csv".equals(typ)) {
				moebelstueckModel.leseAusDatei();
				moebelstueckView.zeigeInformationsfensterAn("Das Moebelhaus wurde gelesen!");
			} else {
				moebelstueckView.zeigeInformationsfensterAn("Noch nicht implementiert!");
			}
		} catch (IOException exc) {
			moebelstueckView.zeigeFehlermeldungsfensterAn("IOException beim Lesen!");
		} catch (Exception exc) {
			moebelstueckView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Lesen!");
		}
	}

	public void zeigeMoebelhausAn(String typ) {
		try {
			if ("csv".equals(typ)) {
				moebelstueckModel.leseAusDatei();
				moebelstueckView.zeigeInformationsfensterAn("Das Moebelhaus wurde gelesen!");
			} else {
				moebelstueckView.zeigeInformationsfensterAn("Noch nicht implementiert!");
			}
		} catch (IOException exc) {
			moebelstueckView.zeigeFehlermeldungsfensterAn("IOException beim Lesen!");
		} catch (Exception exc) {
			moebelstueckView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Lesen!");
		}
	}

}
