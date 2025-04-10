package aufgabe1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public String readFile() {

		StringBuilder inhalt = new StringBuilder();

		try (FileReader fileReader = new FileReader("Test.txt");
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {

			String zeile;
			while ((zeile = bufferedReader.readLine()) != null) {
				inhalt.append(zeile).append("\n");
			}
		} catch (IOException e) {
			System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
		}
		return inhalt.toString();
	}

	public void writeFile(String inhalt) {
		try (FileWriter fileWriter = new FileWriter("Test_Kopie.txt")) {
			fileWriter.write(inhalt);
			System.out.println("Datei erfolgreich geschrieben.");
			System.out.println(inhalt);
		} catch (IOException e) {
			System.out.println("Fehler beim Schreiben der Datei: " + e.getMessage());
		}
	}

}
