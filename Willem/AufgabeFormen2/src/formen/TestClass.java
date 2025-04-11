package formen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * this whacky testclass tests all functions of the shapes when accessed
 * statically in the main function
 */
public class TestClass {

	public static void fullProcess(String dateiName) {
		ArrayList<Punkt> fullList = new ArrayList<Punkt>();
		fullList = readBinary(dateiName);
		fullList.addAll(getRandomDaten(10, 100));
		System.out.println(fullList);
		createBinary(dateiName, fullList);
	}
	
	/**
	 * this method is a general Test for the three shapes
	 */
	public static void testFormen() {
		Quadrat quadrat = new Quadrat(1, 1, 2.5);
		System.out.println(quadrat.getUmfang() == 20);

		Rechteck rechteck = new Rechteck(1, 1, 2.5, 5);
		System.out.println(rechteck.getFlaeche() == 50);
		System.out.println(rechteck.getUmfang() == 30);

		Kreis kreis = new Kreis(1, 1, 5.0);
		System.out.println(kreis.getFlaeche() == Math.PI * 5 * 5);
		System.out.println(kreis.getUmfang() == 2 * Math.PI * 5);
	}

	/**
	 * this yee yee ahh class creates 5 different formen objects and returns them as
	 * a ArrayList
	 * 
	 * @return Arraylist
	 */
	public static ArrayList<Punkt> getRandomDaten(int anzahlObj , int maximum) {
		ArrayList<Punkt> testObj = new ArrayList<>();
		
		for (int i = 0; i <= anzahlObj; i++) {
			double randomObj =  Math.random() * 3;
			switch ((int)randomObj) {
			case 1:
				testObj.add(new Quadrat((Math.random() * maximum), (Math.random() * maximum), (Math.random() * maximum)));
				break;
			case 2:
				testObj.add(new Rechteck((Math.random() * maximum), (Math.random() * maximum), (Math.random() * maximum), (Math.random() * maximum)));
				break;
			case 3:
				testObj.add(new Kreis((Math.random() * maximum), (Math.random() * maximum), (Math.random() * maximum)));
				break;
			}
			
		}
		return testObj;
	}

	/**
	 * this method gets a array containing all three different shapes. The array can
	 * be as long as wanted The method prints out every calculation made for the
	 * shapes and their X and Y.
	 * 
	 * @param eingabe
	 */
	public static void gebeDatenAus(ArrayList<Punkt> eingabe) {
		for (Punkt el : eingabe) {
			if (el instanceof Quadrat) {
				System.out.println("Quadrat:");
				System.out.println("X: " + ((Quadrat) el).getX());
				System.out.println("Y: " + ((Quadrat) el).getY());
				System.out.println("Umfang: " + ((Quadrat) el).getUmfang());
				System.out.println("--------------");
			}
			if (el instanceof Rechteck) {
				System.out.println("Rechteck:");
				System.out.println("X: " + ((Rechteck) el).getX());
				System.out.println("Y: " + ((Rechteck) el).getY());
				System.out.println("Umfang: " + ((Rechteck) el).getUmfang());
				System.out.println("Flaeche: " + ((Rechteck) el).getFlaeche());
				System.out.println("--------------");
			}
			if (el instanceof Kreis) {
				System.out.println("Kreis:");
				System.out.println("X: " + ((Kreis) el).getX());
				System.out.println("Y: " + ((Kreis) el).getY());
				System.out.println("Umfang: " + ((Kreis) el).getUmfang());
				System.out.println("Flaeche: " + ((Kreis) el).getFlaeche());
				System.out.println("--------------");
			}
		}
		System.out.println("Anzahl Elemente: " + eingabe.size());
	}

	/**
	 * ist halt besser als die erste version so nh
	 * 
	 * @param eingabe
	 */
	public static void gebeDatenAus2(ArrayList<Punkt> eingabe) {
		for (Punkt el : eingabe) {
			System.out.println(el.getClass().getName() + ": ");
			System.out.println("X: " + el.getX());
			System.out.println("Y: " + el.getY());
			System.out.println("Umfang: " + el.getUmfang());
			System.out.println("Flaeche: " + el.getFlaeche());
		}
	}

	public static void createBinary(String dateiName, ArrayList<Punkt> eingabe) {

		try {
			FileOutputStream fileOut = new FileOutputStream(dateiName);
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
//			for (Punkt object : eingabe) {
				objOut.writeObject(eingabe);
//			}
			objOut.flush();
			objOut.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<Punkt> readBinary(String dateiName) {
		ArrayList<Punkt> ausgabe = new ArrayList<Punkt>();
		try {
			FileInputStream fileIn = new FileInputStream(dateiName);
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			try {
				ausgabe = (ArrayList<Punkt>) objIn.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			objIn.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return ausgabe;
	}

}
