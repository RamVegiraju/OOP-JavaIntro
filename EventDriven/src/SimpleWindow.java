import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleWindow extends JFrame {
	
	JLabel label;
	
	public SimpleWindow() {
		label = new JLabel("Nothing has happened");
	}
	
	
	
	public static void main(String[] args) {
		WindowRunnable myWindow  = new WindowRunnable();
		
		javax.swing.SwingUtilities.invokeLater(myWindow);
		
	}
	
	
	public static void createAndShowGUI() {
		SimpleWindow frame = new SimpleWindow();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addComponentsToPane(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public void addComponentsToPane(Container pane) {
		JPanel panel = new JPanel();
		panel.add(label);
		pane.add(panel);
		
	}
	
	

}

class WindowRunnable implements Runnable {
	public void run() {
		SimpleWindow.createAndShowGUI();
	}
}
