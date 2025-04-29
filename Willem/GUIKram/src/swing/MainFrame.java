package swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public MainFrame() {
        JFrame frame = new JFrame("Swing Beispiel");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());

        
        frame.add(new MainPanel(), BorderLayout.CENTER);

        frame.setVisible(true);

    }
}

