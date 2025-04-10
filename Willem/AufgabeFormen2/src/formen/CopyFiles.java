package formen;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class CopyFiles {

	

	public static void writeFile(ArrayList<Punkt> eingabe) {
		try (FileWriter fileWriter = new FileWriter("Ausgabe.txt", true)) {
			fileWriter.write("-----------------------------\n");
			fileWriter.write(LocalDateTime.now().toString() + "\n");
			for (int i = 0; i < eingabe.size(); i++) {
				Punkt punkt = eingabe.get(i);
				fileWriter.write(punkt.toString() + " Fläche: " + punkt.getFlaeche() + " Umfang: " + punkt.getUmfang() + "\n");
			}
		} catch (IOException e) {
			System.out.println("Fehler beim Schreiben der Datei: " + e.getMessage());
		}
	}
}
