package anderesding;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

public class Main extends JPanel {
	private static final long serialVersionUID = 1L;

	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
     // Setze die Farbe für das Dreieck
        g.setColor(Color.BLACK);

        // Definiere die Koordinaten der drei Eckpunkte
        int[] xPoints = {50, 200, 350};
        int[] yPoints = {300, 500, 300};

        // Zeichne ein leeres Dreieck (nur Umrandung)
        g.drawPolygon(xPoints, yPoints, 3);

        // Zeichne ein Rechteck
        g.drawRect(50, 50, 100, 100);

        // Setze eine andere Farbe
        g.setColor(Color.RED);

        // Zeichne eine Linie
        g.drawLine(200, 20, 400, 200);
        
        g.fillOval(500, 50, 200, 500);
        
        g.draw3DRect(300, 400, 100, 100, false);

        // Zeichne einen Kreis
        g.drawOval(150, 50, 100, 100);
        
        // Zeichne Text
        g.setColor(Color.BLACK);
        
        g.drawString("ähhh Formen und so nh", 60, 180);
        
        System.out.println(LocalDateTime.now().toString());
    }

    public static void main(String[] args) {
        // Erstelle das JFrame-Fenster
        JFrame frame = new JFrame("AWT Graphics Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);

        // Füge das Panel mit der Zeichenmethode hinzu
        frame.add(new Main());

        // Zeige das Fenster
        frame.setVisible(true);
    }
}
