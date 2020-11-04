import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleWindow extends JFrame{
	
	JLabel label;
	JButton button;
	
	/**
	 * For creating a label for the window*/
	public SimpleWindow() {
		label = new JLabel("Nothing has happened");
	}
	
	
	/**
	 * For creating the empty text field on the window**/
	public void CreateTextField() {
		JTextField field1 = new JTextField();
	}
	
	/**
	 * For creating an action button*/
	public void CreateActionButton() {
		button = new JButton();
	}
	
	/**
	 * Display window*/
	public static void createAndShowGUI() {
		SimpleWindow frame = new SimpleWindow();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.CreateTextField();
		frame.CreateActionButton();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		

	}

}
