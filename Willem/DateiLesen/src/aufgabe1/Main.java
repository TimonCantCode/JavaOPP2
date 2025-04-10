package aufgabe1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		String path = "C:\\Users\\Mein PC\\Java_Uni_2\\JavaOPP2\\Willem\\DateiLesen\\Test";
//		CopyFile bla = new CopyFile();
//		bla.writeFile(bla.readFile());
		
		aufgabe();

	}
	
	public static void aufgabe() throws IOException {
		String datei = "Test.txt";
		String kopiedatei = "KopieTest.txt";
		BufferedReader br = new BufferedReader(new FileReader(datei));
		BufferedWriter bw = new BufferedWriter(new FileWriter(kopiedatei));
		
		while (br.ready()) {
			String s = br.readLine();
			bw.write(s);
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
