package GUI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public MainFrame() {
        JFrame frame = new JFrame("Swing Beispiel");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());
        
        this.initGUI();
        
//        frame.add(new MainPanel(), BorderLayout.CENTER);

        frame.setVisible(true);

    }
	
	public void initGUI() {
		JMenuBar cMenuBar= createMenuBar();
		setJMenuBar(cMenuBar);
	}
	
	private JMenuBar createMenuBar(){
		 JMenuBar myMenuBar= new JMenuBar();
		 JMenu dateiMenu= new JMenu("Datei");
		 JMenuItem neuItem= new JMenuItem("Neu");
		 JMenuItem spItem= new JMenuItem("Speichern");
		 JMenuItem beItem= new JMenuItem("Beenden");
		 dateiMenu.add(neuItem);
		 dateiMenu.add(spItem);
		 dateiMenu.add(beItem);
		 myMenuBar.add (dateiMenu);
		 return myMenuBar; 
		}
}
