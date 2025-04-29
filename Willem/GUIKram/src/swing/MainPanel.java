package swing;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Setze die Zeichenfarbe
        g.setColor(Color.BLUE);

        // Zeichne ein Rechteck
        g.fillRect(50, 50, 100, 100);

        // Setze eine andere Farbe
        g.setColor(Color.RED);

        // Zeichne eine Linie
        g.drawLine(20, 20, 200, 200);

        // Zeichne einen Kreis
        g.drawOval(150, 50, 100, 100);
        
        // Zeichne Text
        g.setColor(Color.BLACK);
        g.drawString("AWT Graphics in Swing!", 60, 180);
    }
}
