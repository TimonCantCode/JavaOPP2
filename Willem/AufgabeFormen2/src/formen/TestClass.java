package formen;

import java.util.ArrayList;

/**
 * this whacky testclass tests all functions of the shapes when accessed
 * statically in the main function
 */
public class TestClass {

	public TestClass() {
//		testFormen();
		ArrayList<Punkt> testObj = new ArrayList<>();
		testObj.add(new Quadrat(1, 1, 2.5));
		testObj.add(new Rechteck(2, 1, 5.5, 8.7));
		testObj.add(new Rechteck(1, 2, 2.8, 12.2));
		testObj.add(new Kreis(1, 3, 7));
		testObj.add(new Kreis(3, 4, 9));
//		gebeDatenAus(testObj);
		gebeDatenAus2(testObj);

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

}
