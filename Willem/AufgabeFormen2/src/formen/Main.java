package formen;

public class Main {

	public static void main(String[] args) { 
//		TestClass.testFormen();
//		new TestClass();
		Quadrat bla = new Quadrat(1,1,1);
		Rechteck blub = new Rechteck(1,1,2, 2);
//		System.out.println(bla.toString());
		System.out.println(bla.compareTo(blub));
	}

}
